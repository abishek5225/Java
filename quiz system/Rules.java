import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton Start , back;
    Rules(String name){
    this.name= name;
        getContentPane().setBackground(Color.white);
        setLayout(null);




        JLabel heading =new JLabel("RULES");
        heading.setBounds(300,15,700,40);
        heading.setFont(new Font("2Peas Blocks", Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules =new JLabel("RULES");
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("2Peas Blocks", Font.PLAIN,16));
        rules.setText(
        "<html>"+
                "1. The quiz game consists of multiple-choice questions with a predetermined set of options." +"<br><br>" +
                "2. The player's objective is to select the correct answer from the given options for each question." +"<br><br>" +
                "3. Each correct answer earns 10 points, while incorrect answers do not score any points." +"<br><br>" +
                "4. The game continues until all the questions have been answered." +"<br><br>" +
                "5. After answering all the questions, the player receives a final score based on the number of correct answers." +"<br><br>" +
                "6. The player have a limited amount of time to answer each question. If the time limit expires before answering, it is considered an incorrect answer." +"<br><br><br>" +

                "Note: You have a single chance to seek help during the game, so make it count."+
                "<html>"

                );
        add(rules);
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Start = new JButton("Start");
        Start.setBounds(400,500,100,30);
        Start.setBackground(Color.BLUE);
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);


        setSize(800,650);
    setLocation(350,100);
    setVisible(true);
    }

    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){

        new Rules("user");
    }
}
