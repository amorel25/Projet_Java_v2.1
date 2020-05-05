package general;

import GUI.MainWindow;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hello");

	    GameManager jeu = new GameManager();
        MainWindow win = new MainWindow(jeu);
        jeu.addObserver(win);
    }
}
