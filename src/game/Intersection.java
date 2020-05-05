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

    public Intersection(Goban goban, int x, int y) {
        this.goban = goban;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
