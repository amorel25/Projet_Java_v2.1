package general;

import game.GameRecord;
import game.Intersection;

import java.util.HashSet;
import java.util.Set;

public class Goban {
    private static Goban single_instance;
    private static int height;
    private static int width;

    static {
        single_instance = null;
    }


    public static Goban getInstance(){
        if(single_instance == null){
            single_instance = new Goban(width, height);
        }
        return single_instance;
    }

    private final Intersection[][] intersections;

    private final GameRecord gameRecord;

    private Set<Intersection> lastCaptured;

    private Player p1, p2, currentPlayer;

    //handicap initial
    private final int initHandicap;

    //handicap pierre
    private int handicap;

    //compteur du nombre de tour passé
    private int successivePassCount;

    //constructeur avec les dimensions sans handicap
    public Goban(int width, int height) {
        this(width, height, 0);
    }

    //constructeur avec les dimensions et le handicap
    public Goban(int width, int height, int handicap) {
        this.width = width;
        this.height = height;
        this.initHandicap = handicap;
        this.successivePassCount = 0;
        this.intersections = new Intersection[width][height];
        this.gameRecord = new GameRecord(width, height, handicap);
        initGoban();
    }

/*    public Goban(GameRecord gameRecord1){
        this.gameRecord = gameRecord1;
        this.width = gameRecord.getLastTurn().getGobanState().length;
        this.height = gameRecord.getLastTurn().getGobanState()[0].length;
        this.initHandicap = gameRecord.getHandicap();

        intersections = new Intersection[width][height];
        initGoban();

        if(gameRecord.nbPreceding() > initHandicap){
            if((gameRecord.nbPreceding() - initHandicap)%2 == 1){
                currentPlayer = p2;
            }
            handicap = initHandicap;
        }else{
            handicap = gameRecord.nbPreceding();
        }

        try{
            takeGameTurn(this.gameRecord.getLastTurn(), p1, p2);
        }catch (Exception e){
            //message par défaut
        }
    }
*/
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public GameRecord getGameRecord() {
        return gameRecord;
    }

    public int getHandicap() {
        return initHandicap;
    }

    public int getSuccessivePassCount() {
        return successivePassCount;
    }

    private void initGoban(){
        lastCaptured = new HashSet<Intersection>();

        p1 = new Player(1);
        p2 = new Player(2);
        currentPlayer = p1;

        for(int x=0; x < this.width; x++){
            for(int y=0; y < this.height; y++){
                intersections[x][y] = new Intersection(this, x, y);
            }
        }
        handicap = 0;
    }

    public boolean isInGoban(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public boolean isInGoban(Intersection intersection) {
        int x = intersection.getX();
        int y = intersection.getY();
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public void updatePassCount(boolean pass){
        if(pass){
            successivePassCount++;
        }else{
            successivePassCount = 0;
        }
    }

    public Intersection getIntersection(int x, int y){
        if(isInGoban(x,y)){
            return intersections[x][y];
        }else{
            return null;
        }
    }

}
