package general;

import GUI.MainWindow;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hello");

	    GameManager game = new GameManager();
        MainWindow win = new MainWindow(game);
        game.addObserver(win);

        Stone stone = new Stone(Player.BLACK,5,5);
        Stone stone1 = new Stone(Player.WHITE,1,1);
        System.out.println("couleur joueur : " + stone1.getColorPlayer() + " coordonnée X : " + stone1.getX() + " coordonnée Y : " + stone1.getY());
        System.out.println("couleur joueur : " + stone.getColorPlayer() + " coordonnée X : " + stone.getX() + " coordonnée Y : " + stone.getY());
    }
}
