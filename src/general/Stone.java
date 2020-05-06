package general;

import State.GameState;
import game.Intersection;

import java.util.HashSet;
import java.util.Set;

public class Stone {

  private static int idx;
  private final int id;
  private final Player colorPlayer;
  private final int x;
  private final int y;
  private final int placeTime;
  private int prisonTime;

    public Stone(Player colorPlayer, int x, int y) {
        this.colorPlayer = colorPlayer;
        this.x = x;
        this.y = y;
        prisonTime = -1;
        this.id = idx++;
    }

    public boolean isPrisoner(){

        return prisonTime != -1;

    }

    public static int getIdx() {
        return idx;
    }

    public int getId() {
        return id;
    }

    public Player getColorPlayer() {
        return colorPlayer;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPlaceTime() {
        return placeTime;
    }

    public int getPrisonTime() {
        return prisonTime;
    }

    public static void setIdxCounter(int idxSet){
        idx = idxSet;
    }

    public static void resetIdxCounter(){
        idx = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colorPlayer == null) ? 0 : colorPlayer.hashCode());
        result = prime * result + id;
        result = prime * result + placeTime;
        result = prime * result + prisonTime;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stone other = (Stone) obj;
        if (colorPlayer != other.colorPlayer)
            return false;
        if (id != other.id)
            return false;
        if (placeTime != other.placeTime)
            return false;
        if (prisonTime != other.prisonTime)
            return false;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public boolean similar(Stone s) {
        if (this == s)
            return true;
        if (s == null)
            return false;
        if (colorPlayer != s.colorPlayer)
            return false;
        if (x != s.x)
            return false;
        if (y != s.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Stone [id=" + id + ", color=" + colorPlayer + ", x=" + x + ", y=" + y + ", placeTime=" + placeTime
                + ", prisonTime=" + prisonTime + "]";
    }
}
