package general;

import java.util.Observable;

public class GameManager extends Observable {
    private Goban goban;

    public Player p1;
    public Player p2;

    public GameManager(){
        goban = Goban.getInstance();

        p1 = new Player(1);
        p2 = new Player(2);
    }
}
