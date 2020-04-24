package game;

import general.Goban;
import general.Stone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    private final Goban goban;
    private final int x,y;
    private Stone stoneChain;

    public Intersection(Goban goban, int x, int y) {
        this.goban = goban;
        this.x = x;
        this.y = y;
        this.stoneChain = null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Stone getStoneChain() {
        return stoneChain;
    }

    public void setStoneChain(Stone stoneChain) {
        this.stoneChain = stoneChain;
    }

    public boolean isEmpty(){
        return stoneChain == null;
    }

    public Set<Stone> getAjacentStoneChains(){
        Set<Stone> adjacentStoneChains = new HashSet<Stone>();

        int [] dx = {-1,0,1,0}, dy = {0,-1,0,1};
        assert dx.length == dy.length : "dx et dy doivent avoir la même longueur";

        for(int i = 0; i < dx.length ; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(goban.isInGoban(newX,newY)){
                Intersection adjIntersection = goban.getIntersection(newX, newY);
                if(adjIntersection.stoneChain != null){
                    adjacentStoneChains.add(adjIntersection.stoneChain);
                }
            }
        }

        return adjacentStoneChains;
    }

    public List<Intersection> getEmptyNeighbors(){
        List<Intersection> emptyNeighors = new ArrayList<Intersection>();

        int [] dx = {-1,0,1,0}, dy = {0,-1,0,1};
        assert dx.length == dy.length : "dx et dy doivent avoir la même longueur";

        for(int i = 0; i < dx.length ; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (goban.isInGoban(newX, newY)) {
                Intersection adjIntersection = goban.getIntersection(newX, newY);
                if(adjIntersection.isEmpty()){
                    emptyNeighors.add(adjIntersection);
                }
            }
        }

        return emptyNeighors;
    }

    public List<Intersection> getEmptyOrDeadNeighbors(Set<Stone> deadChains){

        List<Intersection> emptyNeighors = new ArrayList<Intersection>();

        int [] dx = {-1,0,1,0}, dy = {0,-1,0,1};
        assert dx.length == dy.length : "dx et dy doivent avoir la même longueur";

        for(int i = 0; i < dx.length ; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (goban.isInGoban(newX, newY)) {
                Intersection adjIntersection = goban.getIntersection(newX, newY);
                if(adjIntersection.isEmpty() || deadChains.contains(adjIntersection.getStoneChain())){
                    emptyNeighors.add(adjIntersection);
                }
            }
        }
        return emptyNeighors;

    }
}
