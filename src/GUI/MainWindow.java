package GUI;

import general.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import static javax.swing.SwingConstants.CENTER;

public class MainWindow extends JFrame implements Observer {
    private JFrame gameWindow;
    private GameManager game;
    private final JPanel board = new JPanel();
    private CaseModel[][] board2;
    private final JPanel info = new JPanel();
    private char[][] map;
    private File file;
    private String nameFile = "asset/board.txt";

    //variable pour board
    ArrayList<JLabel> label = new ArrayList<JLabel>();

    private final JLabel blank = new JLabel(" ");
    private final JLabel n1 = new JLabel("1");
    private final JLabel n2 = new JLabel("2");
    private final JLabel n3 = new JLabel("3");
    private final JLabel n4 = new JLabel("4");
    private final JLabel n5 = new JLabel("5");
    private final JLabel n6 = new JLabel("6");
    private final JLabel n7 = new JLabel("7");
    private final JLabel n8 = new JLabel("8");
    private final JLabel n9 = new JLabel("9");
    private final JLabel image = new JLabel();

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
        this.map = new char[25][25];
        this.board2 = map();
        file = new File(nameFile);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.canRead());
        init();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        System.out.println("init");
        //Création du plateau
        int dim = 10;
        board.setLayout(new GridLayout(dim, dim, 0,0));
        board.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
/*
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
        board.add(rb);*/

        for(JLabel j:label){
            System.out.println(j);
            board.add(j);
        }

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

    public char[][] parcoursMap(String nameFile){
        int i=0;
        int j=0;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        File file = new File(nameFile);
        System.out.println(file.getAbsoluteFile());
        try {
            fis = new FileInputStream(file.getAbsoluteFile());
            bis = new BufferedInputStream(new FileInputStream(file.getAbsoluteFile()));
            int buffer;
            String ligne="";
            while((buffer = fis.read()) != -1){
                if (buffer != 32 && buffer != 10 && i<this.map.length){
                    if (j == 10){
                        i++;
                        j=0;
                        this.map[i][j]=(char)buffer;
                        System.out.println(this.map[i][j]+" i "+i+" j "+j);
                    }
                    else{
                        this.map[i][j]=(char)buffer;
                        System.out.println(this.map[i][j]+" i "+i+" j "+j);
                        j++;
                    }
                }
            }
            bis.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public boolean isEmpty(char[][] map){
        for (int i=0; i<10;i++){
            for (int j=0; j<10;j++){
                if (map[i][j] != '\0'){
                    return false;
                }
            }
        }
        return true;
    }

    public CaseModel[][] map(){
        CaseModel[][] board2 = new CaseModel[10][10];
        ElemCaseModel elem;
        int k = 0;
        if (isEmpty(this.map)){
            System.out.println("empty");
            this.map = parcoursMap(nameFile);
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                try {
                //    System.out.println(this.map[i][j]+" i "+i+" j "+j);
                    switch (this.map[i][j])
                    {

                        case '0':
                            System.out.println("cas 0 i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(blank, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(blank);
                            break;
                        case '1':
                            System.out.println("cas 1 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n1, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n1);
                            break;
                        case '2':
                           System.out.println("cas 2 : i : "+i+" j : "+j);
                           board2[i][j]= new CaseModel(i, j);
                           elem = new ElemCaseModel(n2, board2[i][j]);
                           board2[i][j].getCompElemCase().add(elem);
                            label.add(n2);
                           break;
                        case '3':
                            System.out.println("cas 3 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n3, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n3);
                            break;
                        case '4' :
                            System.out.println("cas 4 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n4, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n4);
                            break;
                        case '5' :
                            System.out.println("cas 5 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n5, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n5);
                            break;
                        case '6' :
                            System.out.println("cas 6 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n6, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n6);
                            break;
                        case '7' :
                            System.out.println("cas 7 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n7, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n7);
                            break;
                        case '8' :
                            System.out.println("cas 8 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n8, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n8);
                            break;
                        case '9' :
                            System.out.println("cas 9 : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(n9, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            label.add(n9);
                            break;
                        case 'g':
                            System.out.println("cas g : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(leftTop, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(leftTop);
                            label.add(image);
                            break;
                        case 'd':
                            System.out.println("cas g : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(rightTop, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(rightTop);
                            label.add(image);
                            break;
                        case 't':
                            System.out.println("cas t : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(top, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(top);
                            label.add(image);
                            break;
                        case 'l':
                            System.out.println("cas l : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(left, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(left);
                            label.add(image);
                            break;
                        case 'c':
                            System.out.println("cas c : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(cross, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(cross);
                            label.add(image);
                            break;
                        case 'r':
                            System.out.println("cas r : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(right, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(right);
                            label.add(image);
                            break;
                        case 'G':
                            System.out.println("cas G : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(leftBottom, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(leftBottom);
                            label.add(image);
                            break;
                        case 'b':
                            System.out.println("cas b : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(bottom, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(bottom);
                            label.add(image);
                            break;
                        case 'D':
                            System.out.println("cas D : i : "+i+" j : "+j);
                            board2[i][j]= new CaseModel(i, j);
                            elem = new ElemCaseModel(rightBottom, board2[i][j]);
                            board2[i][j].getCompElemCase().add(elem);
                            image.setIcon(rightBottom);
                            label.add(image);
                            break;
                        default:
                            System.out.println("Error : afficheMapGraphique() ");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("EROROROROROROROR");
                }

            }
        }
        return board2;
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
