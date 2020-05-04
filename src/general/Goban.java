package general;

import game.Intersection;

import java.util.HashSet;

public class Goban {

    private static Goban single_instance;
    private static int height;
    private static int width;
    //handicap pierre
    private static int handicap;

    static {
        single_instance = null;
    }


    public static Goban getInstance(){
        if(single_instance == null){
            single_instance = new Goban(width, height, handicap);

        }
        return single_instance;
    }

    private final Intersection[][] intersections;

    //handicap initial
    private final int initHandicap;

    //constructeur avec les dimensions et le handicap
    public Goban(int width, int height, int handicap) {
        this.width = width;
        this.height = height;
        this.initHandicap = handicap;
        this.intersections = new Intersection[width][height];
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getHandicap() {
        return initHandicap;
    }



    public Intersection getIntersection(int x, int y) {
        if (isInGoban(x, y)) {
            return intersections[x][y];
        } else {
            return null;
        }
    }

    public boolean isInGoban(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }


    public boolean isInGoban(Intersection intersection) {
        int x = intersection.getX();
        int y = intersection.getY();
        return (x >= 0 && x < width && y >= 0 && y < height);
    }



}





