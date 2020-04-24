package general;

import game.Intersection;

import java.util.HashSet;
import java.util.Set;

public class Stone {

    private final Set<Intersection> stones;

    private final Set<Intersection> liberties;

    private final Player owner;

    public Stone(Set<Intersection> stones, Set<Intersection> liberties, Player owner) {
        this.stones = stones;
        this.liberties = liberties;
        this.owner = owner;
    }

    public Stone(Intersection intersection, Player owner) {
        stones = new HashSet<Intersection>();
        stones.add(intersection);
        this.owner = owner;
        liberties = new HashSet<Intersection>(intersection.getEmptyNeighbors());
    }

    public Stone(Stone stoneChain){
        this.stones = new HashSet<Intersection>(stoneChain.stones);
        this.liberties = new HashSet<>(stoneChain.liberties);
        this.owner = stoneChain.owner;
    }

    public Player getOwner(){
        return owner;
    }

    public Set<Intersection> getLiberties(){
        return liberties;
    }

    public Set<Intersection> getStones() {
        return stones;
    }

    public void addStone(Stone stoneChain, Intersection playedStone){
        this.stones.addAll(stoneChain.stones);
        this.liberties.addAll(stoneChain.liberties);
        this.liberties.remove(playedStone);

    }

    public Stone removeLiberty(Intersection playedStone){
        Stone newStoneChain = new Stone(stones, liberties, owner);
        newStoneChain.liberties.remove(playedStone);
        return newStoneChain;
    }

    public void die(){
        for(Intersection rollingStone : this.stones){
            rollingStone.setStoneChain(null);
            Set<Stone> adjacentStoneChains = rollingStone.getAjacentStoneChains();
            for(Stone stone : adjacentStoneChains){
                stone.liberties.add(rollingStone);
            }
        }

        this.owner.addCapturedStones(this.stones.size());
    }
}
