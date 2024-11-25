import javax.swing.*;
import java.awt.*;
import java.util.*;
public class gui1 {
    public static void main(String[] args) {
        JFrame obj1=new JFrame();
        obj1.setVisible(true);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj1.setBounds(100,100,1000,700);
        obj1.setTitle("My Frame");

        Container obj2=obj1.getContentPane();
        obj2.setBackground(Color.cyan);
        obj2.setLayout(null);


        ImageIcon icon=new ImageIcon("C:\\Users\\dell\\Pictures\\Screenshots\\image.png");
        JLabel obj3=new JLabel("Username",icon,JLabel.CENTER);
        obj3.setBounds(0,100,500,500);
        obj2.add(obj3);

        Font font=new Font("Arial",Font.ITALIC,30);
        obj3.setFont(font);



        obj2.add(obj3);

    }
}
