package general;

import GUI.MainWindow;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hello");

	    GameManager game = new GameManager();
        MainWindow win = new MainWindow(game);
        game.addObserver(win);

    }
}
