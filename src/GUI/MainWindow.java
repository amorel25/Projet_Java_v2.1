package GUI;

import general.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MainWindow extends JFrame implements ActionListener, Observer {
    private final int dim = 9;
    private JPanel pan = new JPanel();
    private JFrame gameWindow;
    private JPanel info = new JPanel();
    private JTextField position;
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

    public MainWindow(GameManager jeu) {
        this.setTitle("Jeu de Go");
        //this.setSize(800, 800);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocation(0,0);
        this.setVisible(true);
        this.getContentPane().setLayout(new GridLayout(1,2));
        this.getContentPane().add(pan);
        this.getContentPane().add(info);
        //this.setContentPane(pan);
        init();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        System.out.println("init");
        pan.setLayout(new GridLayout(dim,dim, 0,0));
        pan.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

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

        pan.add(lt);
        pan.add(t1);
        pan.add(t2);
        pan.add(t3);
        pan.add(t4);
        pan.add(t5);
        pan.add(t6);
        pan.add(t7);
        pan.add(rt);
        pan.add(l1);
        pan.add(cr11);
        pan.add(cr12);
        pan.add(cr13);
        pan.add(cr14);
        pan.add(cr15);
        pan.add(cr16);
        pan.add(cr17);
        pan.add(r1);
        pan.add(l2);
        pan.add(cr21);
        pan.add(cr22);
        pan.add(cr23);
        pan.add(cr24);
        pan.add(cr25);
        pan.add(cr26);
        pan.add(cr27);
        pan.add(r2);
        pan.add(l3);
        pan.add(cr31);
        pan.add(cr32);
        pan.add(cr33);
        pan.add(cr34);
        pan.add(cr35);
        pan.add(cr36);
        pan.add(cr37);
        pan.add(r3);
        pan.add(l4);
        pan.add(cr41);
        pan.add(cr42);
        pan.add(cr43);
        pan.add(cr44);
        pan.add(cr45);
        pan.add(cr46);
        pan.add(cr47);
        pan.add(r4);
        pan.add(l5);
        pan.add(cr51);
        pan.add(cr52);
        pan.add(cr53);
        pan.add(cr54);
        pan.add(cr55);
        pan.add(cr56);
        pan.add(cr57);
        pan.add(r5);
        pan.add(l6);
        pan.add(cr61);
        pan.add(cr62);
        pan.add(cr63);
        pan.add(cr64);
        pan.add(cr65);
        pan.add(cr66);
        pan.add(cr67);
        pan.add(r6);
        pan.add(l7);
        pan.add(cr71);
        pan.add(cr72);
        pan.add(cr73);
        pan.add(cr74);
        pan.add(cr75);
        pan.add(cr76);
        pan.add(cr77);
        pan.add(r7);
        pan.add(lb);
        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        pan.add(b7);
        pan.add(rb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
