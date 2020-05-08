package GUI;

import general.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import static javax.swing.SwingConstants.CENTER;

public class MainWindow extends JFrame implements Observer {
    private JFrame gameWindow;
    private GameManager game;
    private final JPanel board = new JPanel();
    private final JPanel info = new JPanel();

    //variable pour board
    private ArrayList<JLabel> board2 = new ArrayList<JLabel>();

    private final JLabel blank = new JLabel(" ");
    private final JLabel nl1 = new JLabel("1");
    private final JLabel nl2 = new JLabel("2");
    private final JLabel nl3 = new JLabel("3");
    private final JLabel nl4 = new JLabel("4");
    private final JLabel nl5 = new JLabel("5");
    private final JLabel nl6 = new JLabel("6");
    private final JLabel nl7 = new JLabel("7");
    private final JLabel nl8 = new JLabel("8");
    private final JLabel nl9 = new JLabel("9");
    private final JLabel nc1 = new JLabel("1");
    private final JLabel nc2 = new JLabel("2");
    private final JLabel nc3 = new JLabel("3");
    private final JLabel nc4 = new JLabel("4");
    private final JLabel nc5 = new JLabel("5");
    private final JLabel nc6 = new JLabel("6");
    private final JLabel nc7 = new JLabel("7");
    private final JLabel nc8 = new JLabel("8");
    private final JLabel nc9 = new JLabel("9");
    private final JLabel lb = new JLabel();
    private final JLabel rb = new JLabel();
    private final JLabel b1 = new JLabel();
    private final JLabel b2 = new JLabel();
    private final JLabel b3 = new JLabel();
    private final JLabel b4 = new JLabel();
    private final JLabel b5 = new JLabel();
    private final JLabel b6 = new JLabel();
    private final JLabel b7 = new JLabel();
    private final JLabel r1 = new JLabel();
    private final JLabel r2 = new JLabel();
    private final JLabel r3 = new JLabel();
    private final JLabel r4 = new JLabel();
    private final JLabel r5 = new JLabel();
    private final JLabel r6 = new JLabel();
    private final JLabel r7 = new JLabel();
    private final JLabel l1 = new JLabel();
    private final JLabel l2 = new JLabel();
    private final JLabel l3 = new JLabel();
    private final JLabel l4 = new JLabel();
    private final JLabel l5 = new JLabel();
    private final JLabel l6 = new JLabel();
    private final JLabel l7 = new JLabel();
    private final JLabel lt = new JLabel();
    private final JLabel rt = new JLabel();
    private final JLabel t1 = new JLabel();
    private final JLabel t2 = new JLabel();
    private final JLabel t3 = new JLabel();
    private final JLabel t4 = new JLabel();
    private final JLabel t5 = new JLabel();
    private final JLabel t6 = new JLabel();
    private final JLabel t7 = new JLabel();
    private final JLabel cr11 = new JLabel();
    private final JLabel cr21 = new JLabel();
    private final JLabel cr31 = new JLabel();
    private final JLabel cr41 = new JLabel();
    private final JLabel cr51 = new JLabel();
    private final JLabel cr61 = new JLabel();
    private final JLabel cr71 = new JLabel();
    private final JLabel cr12 = new JLabel();
    private final JLabel cr22 = new JLabel();
    private final JLabel cr32 = new JLabel();
    private final JLabel cr42 = new JLabel();
    private final JLabel cr52 = new JLabel();
    private final JLabel cr62 = new JLabel();
    private final JLabel cr72 = new JLabel();
    private final JLabel cr13 = new JLabel();
    private final JLabel cr23 = new JLabel();
    private final JLabel cr33 = new JLabel();
    private final JLabel cr43 = new JLabel();
    private final JLabel cr53 = new JLabel();
    private final JLabel cr63 = new JLabel();
    private final JLabel cr73 = new JLabel();
    private final JLabel cr14 = new JLabel();
    private final JLabel cr24 = new JLabel();
    private final JLabel cr34 = new JLabel();
    private final JLabel cr44 = new JLabel();
    private final JLabel cr54 = new JLabel();
    private final JLabel cr64 = new JLabel();
    private final JLabel cr74 = new JLabel();
    private final JLabel cr15 = new JLabel();
    private final JLabel cr25 = new JLabel();
    private final JLabel cr35 = new JLabel();
    private final JLabel cr45 = new JLabel();
    private final JLabel cr55 = new JLabel();
    private final JLabel cr65 = new JLabel();
    private final JLabel cr75 = new JLabel();
    private final JLabel cr16 = new JLabel();
    private final JLabel cr26 = new JLabel();
    private final JLabel cr36 = new JLabel();
    private final JLabel cr46 = new JLabel();
    private final JLabel cr56 = new JLabel();
    private final JLabel cr66 = new JLabel();
    private final JLabel cr76 = new JLabel();
    private final JLabel cr17 = new JLabel();
    private final JLabel cr27 = new JLabel();
    private final JLabel cr37 = new JLabel();
    private final JLabel cr47 = new JLabel();
    private final JLabel cr57 = new JLabel();
    private final JLabel cr67 = new JLabel();
    private final JLabel cr77 = new JLabel();

    ImageIcon leftBottom = new ImageIcon("asset/bl.png");
    ImageIcon rightBottom = new ImageIcon("asset/br.png");
    ImageIcon bottom = new ImageIcon("asset/b.png");
    ImageIcon right = new ImageIcon("asset/r.png");
    ImageIcon left = new ImageIcon("asset/l.png");
    ImageIcon leftTop = new ImageIcon("asset/ul.png");
    ImageIcon rightTop = new ImageIcon("asset/ur.png");
    ImageIcon top = new ImageIcon("asset/u.png");
    ImageIcon cross = new ImageIcon("asset/c.png");

    //variable pour info
    private final JLabel param = new JLabel("");
    private final JButton startAction = new JButton("Lancer partie");
    private final JButton resetAction = new JButton("Nouvelle partie");
    private final JPanel xPanel = new JPanel();
    private final JPanel yPanel = new JPanel();
    private final JButton validCoor = new JButton("Valider coordonnées");
    private final JLabel positionX = new JLabel("x : ");
    private final JLabel positionY = new JLabel("y : ");
    private final JTextField positionXField = new JTextField();
    private final JTextField positionYField = new JTextField();
    private final JLabel playerLabel = new JLabel("Joueurs : ");
    private final JLabel blackPlayer = new JLabel("Black");
    private final JLabel whitePlayer = new JLabel("White");
    private final JLabel scoreLabel = new JLabel("Scores : ");
    private final JLabel blackScore = new JLabel("0");
    private final JLabel whiteScore = new JLabel("0");
    private final JLabel actionLabel = new JLabel("Autres action :");
    private final JButton passAction = new JButton("Passer");
    private final JButton undoAction = new JButton("Annuler");


    public MainWindow(GameManager game) {
        this.setTitle("Jeu de Go");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocation(0,0);
        this.setVisible(true);
        this.game = game;
        this.getContentPane().setLayout(new GridLayout(1,2));
        this.getContentPane().add(board);
        this.getContentPane().add(info);
        init();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        System.out.println("init");
        //Création du plateau
        int dim = 10;
        board.setLayout(new GridLayout(dim, dim, 0,0));
        board.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        lb.setIcon(leftBottom);
        rb.setIcon(rightBottom);
        b1.setIcon(bottom);
        b2.setIcon(bottom);
        b3.setIcon(bottom);
        b4.setIcon(bottom);
        b5.setIcon(bottom);
        b6.setIcon(bottom);
        b7.setIcon(bottom);
        r1.setIcon(right);
        r2.setIcon(right);
        r3.setIcon(right);
        r4.setIcon(right);
        r5.setIcon(right);
        r6.setIcon(right);
        r7.setIcon(right);
        l1.setIcon(left);
        l2.setIcon(left);
        l3.setIcon(left);
        l4.setIcon(left);
        l5.setIcon(left);
        l6.setIcon(left);
        l7.setIcon(left);
        lt.setIcon(leftTop);
        rt.setIcon(rightTop);
        t1.setIcon(top);
        t2.setIcon(top);
        t3.setIcon(top);
        t4.setIcon(top);
        t5.setIcon(top);
        t6.setIcon(top);
        t7.setIcon(top);
        cr11.setIcon(cross);
        cr12.setIcon(cross);
        cr13.setIcon(cross);
        cr14.setIcon(cross);
        cr15.setIcon(cross);
        cr16.setIcon(cross);
        cr17.setIcon(cross);
        cr21.setIcon(cross);
        cr22.setIcon(cross);
        cr23.setIcon(cross);
        cr24.setIcon(cross);
        cr25.setIcon(cross);
        cr26.setIcon(cross);
        cr27.setIcon(cross);
        cr31.setIcon(cross);
        cr32.setIcon(cross);
        cr33.setIcon(cross);
        cr34.setIcon(cross);
        cr35.setIcon(cross);
        cr36.setIcon(cross);
        cr37.setIcon(cross);
        cr41.setIcon(cross);
        cr42.setIcon(cross);
        cr43.setIcon(cross);
        cr44.setIcon(cross);
        cr45.setIcon(cross);
        cr46.setIcon(cross);
        cr47.setIcon(cross);
        cr51.setIcon(cross);
        cr52.setIcon(cross);
        cr53.setIcon(cross);
        cr54.setIcon(cross);
        cr55.setIcon(cross);
        cr56.setIcon(cross);
        cr57.setIcon(cross);
        cr61.setIcon(cross);
        cr62.setIcon(cross);
        cr63.setIcon(cross);
        cr64.setIcon(cross);
        cr65.setIcon(cross);
        cr66.setIcon(cross);
        cr67.setIcon(cross);
        cr71.setIcon(cross);
        cr72.setIcon(cross);
        cr73.setIcon(cross);
        cr74.setIcon(cross);
        cr75.setIcon(cross);
        cr76.setIcon(cross);
        cr77.setIcon(cross);
        nc1.setHorizontalAlignment(CENTER);
        nc2.setHorizontalAlignment(CENTER);
        nc3.setHorizontalAlignment(CENTER);
        nc4.setHorizontalAlignment(CENTER);
        nc5.setHorizontalAlignment(CENTER);
        nc6.setHorizontalAlignment(CENTER);
        nc7.setHorizontalAlignment(CENTER);
        nc8.setHorizontalAlignment(CENTER);
        nc9.setHorizontalAlignment(CENTER);

        board.add(blank);
        board.add(nc1);
        board.add(nc2);
        board.add(nc3);
        board.add(nc4);
        board.add(nc5);
        board.add(nc6);
        board.add(nc7);
        board.add(nc8);
        board.add(nc9);
        board.add(nl1);
        board.add(lt);
        board.add(t1);
        board.add(t2);
        board.add(t3);
        board.add(t4);
        board.add(t5);
        board.add(t6);
        board.add(t7);
        board.add(rt);
        board.add(nl2);
        board.add(l1);
        board.add(cr11);
        board.add(cr12);
        board.add(cr13);
        board.add(cr14);
        board.add(cr15);
        board.add(cr16);
        board.add(cr17);
        board.add(r1);
        board.add(nl3);
        board.add(l2);
        board.add(cr21);
        board.add(cr22);
        board.add(cr23);
        board.add(cr24);
        board.add(cr25);
        board.add(cr26);
        board.add(cr27);
        board.add(r2);
        board.add(nl4);
        board.add(l3);
        board.add(cr31);
        board.add(cr32);
        board.add(cr33);
        board.add(cr34);
        board.add(cr35);
        board.add(cr36);
        board.add(cr37);
        board.add(r3);
        board.add(nl5);
        board.add(l4);
        board.add(cr41);
        board.add(cr42);
        board.add(cr43);
        board.add(cr44);
        board.add(cr45);
        board.add(cr46);
        board.add(cr47);
        board.add(r4);
        board.add(nl6);
        board.add(l5);
        board.add(cr51);
        board.add(cr52);
        board.add(cr53);
        board.add(cr54);
        board.add(cr55);
        board.add(cr56);
        board.add(cr57);
        board.add(r5);
        board.add(nl7);
        board.add(l6);
        board.add(cr61);
        board.add(cr62);
        board.add(cr63);
        board.add(cr64);
        board.add(cr65);
        board.add(cr66);
        board.add(cr67);
        board.add(r6);
        board.add(nl8);
        board.add(l7);
        board.add(cr71);
        board.add(cr72);
        board.add(cr73);
        board.add(cr74);
        board.add(cr75);
        board.add(cr76);
        board.add(cr77);
        board.add(r7);
        board.add(nl9);
        board.add(lb);
        board.add(b1);
        board.add(b2);
        board.add(b3);
        board.add(b4);
        board.add(b5);
        board.add(b6);
        board.add(b7);
        board.add(rb);

        //Création panel info
        info.setLayout(new GridLayout(6,3, 0,0));
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        positionXField.setPreferredSize(new Dimension(50,30));
        positionYField.setPreferredSize(new Dimension(50,30));


        xPanel.add(positionX);
        xPanel.add(positionXField);
        yPanel.add(positionY);
        yPanel.add(positionYField);

        info.add(startAction);
        info.add(param);
        info.add(resetAction);
        info.add(xPanel);
        info.add(yPanel);
        info.add(validCoor);
        info.add(playerLabel);
        info.add(blackPlayer);
        info.add(whitePlayer);
        info.add(scoreLabel);
        info.add(blackScore);
        info.add(whiteScore);
        info.add(actionLabel);
        info.add(passAction);
        info.add(undoAction);

        startAction.addActionListener(new StartActionListener());
        resetAction.addActionListener(new ResetActionListener());
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    private class StartActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("action performed start");
            game.getCurrentState().startGame();
        }
    }

    private class ResetActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("action performed reset");
            game.getCurrentState().resetGame();
            board.repaint();
        }
    }

}
