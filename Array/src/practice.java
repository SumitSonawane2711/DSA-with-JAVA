
import javax.swing.*;
import java.awt.*;

class practice extends JFrame{

  JFrame f;
    practice(){
        JButton B=new JButton("SUMIT");
        B.setBounds(100,100,150,40);
        B.setForeground(Color.red);
        add(B);
        setSize(500,400);
        setLayout(null);
        setVisible(true);

        JButton b=new JButton("Hellow");
        b.setBounds(100,100,150,40);
        b.setForeground(Color.red);
        add(b);
        b.setSize(500,400);
       b. setLayout(null);
        b.setVisible(true);

    }
    public static void main(String[] args) {
     new practice();
    }
}
