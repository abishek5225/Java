import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class JButton extends JFrame{
            public static void main(String[] args) {
                JFrame frame = new JFrame("Hello, World!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Hello, World!");
                frame.add(label);

                frame.pack();
                frame.setVisible(true);
            }
}
