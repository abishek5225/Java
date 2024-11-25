import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Passwordfield {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(300,150,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,50,80,30);
        c.add(pass);

        pass.setForeground(Color.WHITE );
        pass.setBackground(Color.BLACK);

        pass.setEchoChar('*');
        pass.setEchoChar((char)0);


        frame.setVisible(true);
    }
}
