package general;

import game.Intersection;

import java.util.HashSet;

public class Goban {

    private static Goban single_instance;
    private static int height;
    private static int width;

    static {
        single_instance = null;
    }


    public static Goban getInstance(){
        if(single_instance == null){

            single_instance = new Goban(9, 9);

        }
        return single_instance;
    }

    private final Intersection[][] intersections;

    //constructeur avec les dimensions et le handicap
    public Goban(int width, int height) {
        this.width = width;
        this.height = height;
        this.intersections = new Intersection[width][height];
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
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





