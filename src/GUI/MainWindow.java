package GUI;

import general.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MainWindow extends JFrame implements ActionListener, Observer {
    private JPanel pan = new JPanel();

    public MainWindow(GameManager jeu) {
        this.setTitle("Jeu de Go");
        this.setSize(1000, 1000);
        this.setLocation(0,0);
        this.setVisible(true);
        this.setContentPane(pan);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
