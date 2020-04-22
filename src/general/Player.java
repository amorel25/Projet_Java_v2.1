package general;

import game.GameRecord;

import java.util.Collections;

public class Player {
    private final int identity;

    private int capturedStones;

    public Player(int identity){
        this.identity = identity;
        this.capturedStones = 0;
    }

    //getter

    public int getIdentity() {
        return identity;
    }

    public int getCapturedStones() {
        return capturedStones;
    }

    //ajouter des pierres capturées
    public void addCapturedStones(int nb){
        capturedStones += nb;
    }

    //supprimer des pierres capturées
    public void removeCapturedStones(int nb){
        capturedStones -= nb;
    }

    //faire jouer le joueur retourne "true" si le mouvement est possible
    public boolean play(Goban goban, int x, int y){
        if(x == -1 && y == -1){
            GameRecord record = goban.getGameRecord();
            record.apply(record.getLastTurn().toNext(-1,-1, this.getIdentity(), goban.getHandicap(), Collections.<Intersection>emptySet()));
            goban.updatePassCount(true);
            return true;
        }else{
            return goban.play(goban.getIntersection(x,y), this);
        }
    }

    @Override
    public String toString(){
        return "Joueur "+identity;
    }
}
