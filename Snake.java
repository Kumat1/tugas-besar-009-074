package megabelajar;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ASUS on 25/05/2017.
 */
public class Snake extends JFrame {
    public Snake() {
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                JFrame ex = new Snake();
                ex.setVisible(true);
            }
        });
    }
}