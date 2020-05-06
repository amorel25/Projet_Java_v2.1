package general;

import State.GameState;
import game.Intersection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Stone {



  private final Player colorPlayer;
  private final int x;
  private final int y;


    public Stone(Player colorPlayer, int x, int y) {
        this.colorPlayer = colorPlayer;
        this.x = x;
        this.y = y;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return x == stone.x &&
                y == stone.y &&
                colorPlayer == stone.colorPlayer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorPlayer, x, y);
    }
}
