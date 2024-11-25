import javax.swing.*;
import java.awt.*;
import java.util.*;

public class gui2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Text field" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,250,1000,700);


        Container c =frame.getContentPane();
        c.setLayout(null);

        JTextField t1=new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);

       t1.setText("First Name");
       Font font=new Font("Arial",Font.ITALIC,19);
       t1.setFont(font);

       t1.setForeground(Color.BLUE);
        t1.setBackground(Color.green);
        t1.setEditable(false);

        frame.setVisible(true);
    }

}
