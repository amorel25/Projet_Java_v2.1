package game;

import java.util.Arrays;
import java.util.Set;

public class GameTurn {

    private final int x,y;

    private final int hashCode;

    private final int countCapturedStones;

    private int passCount;

    private final int [][] gobanState;


    public GameTurn(GameTurn source) {

        int width = source.gobanState.length;
        int height = source.gobanState[0].length;
        x = source.x;
        y = source.y;
        hashCode = source.hashCode;
        countCapturedStones = source.countCapturedStones;
        passCount = source.passCount;
        gobanState = new int [width][height];
        for( int i = 0; i < width ; i ++){
            gobanState[i] = source.gobanState[i].clone();
        }
    }

    public GameTurn(int width, int height){

        gobanState =  new int[width][height];
        countCapturedStones = 0;
        passCount = 0;

        x = -1;
        y = -1;

        hashCode = Arrays.deepHashCode(gobanState);

    }

    private GameTurn(GameTurn prev, int X, int Y, int playerId, int handicap , Set<Intersection> freedIntersections){

        int width = prev.gobanState.length;
        int height = prev.gobanState[0].length;

        gobanState =  new int[width][height];
        for( int i = 0; i < width; i ++) {
            gobanState[i] = prev.gobanState[i].clone();
        }
            x = X;
            y = Y;

            if(x >= 0 && y >= 0){
                gobanState[x][y] = playerId;
                passCount = 0;
            } else {
                passCount = prev.passCount + 1;
            }
            for (Intersection freedIntersection : freedIntersections){
                gobanState[freedIntersection.getX()][freedIntersection.getY()] = 0;
            }

            countCapturedStones = freedIntersections.size();

            hashCode = Arrays.deepHashCode(gobanState);


    }

    public GameTurn toNext(int X, int Y, int playerId, Set<Intersection> freedIntersections){
        return toNext(X,Y,playerId,0,freedIntersections);
    }

    public GameTurn toNext(int X, int Y , int playerId, int handicap , Set<Intersection> freedIntersections){
        return new GameTurn(this,X,Y,playerId, handicap,freedIntersections);
    }

    public int [][] getGobanState(){
        return gobanState;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getPassCount(){
        return passCount;
    }

    public int hashCode(){
        return hashCode;
    }

    public int getCountCapturedStones(){
        return countCapturedStones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameTurn gameTurn = (GameTurn) o;
        return x == gameTurn.x &&
                y == gameTurn.y &&
                hashCode == gameTurn.hashCode &&
                countCapturedStones == gameTurn.countCapturedStones &&
                passCount == gameTurn.passCount &&
                Arrays.equals(gobanState, gameTurn.gobanState);
    }
}
