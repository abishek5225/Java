import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{




        static String[][] questions = new String[10][6];
        String[][] answer = new String[10][2];
        String[][] user_answers = new String[10][1];
        static JLabel qno;
        static JLabel question;
        static JRadioButton opt1;
        static JRadioButton opt2;
        static JRadioButton opt3;
        static JRadioButton opt4;
        static ButtonGroup groupoption;
        JButton next, help, submit;
        public static int timer = 20;
        public static int ans_given = 0;
        public static int count = 0;
        public static int score=0;

        String name;

        Quiz(String name) {
            this.name=name;

            setBounds(50, 0, 1440, 850);
            getContentPane().setBackground(Color.white);
            setLayout(null);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
            JLabel image = new JLabel(i1);
            image.setBounds(0, 0, 1440, 392);
            add(image);

            qno = new JLabel();
            qno.setBounds(100, 450, 50, 30);
            qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
            add(qno);

            question = new JLabel();
            question.setBounds(150, 450, 900, 30);
            question.setFont(new Font("Tahoma", Font.PLAIN, 18));
            add(question);

            questions[0][0] = "What is the term for a programming language that is easy for humans to read and write?";
            questions[0][1] = "Syntax";
            questions[0][2] = "High-level";
            questions[0][3] = "Machine code";
            questions[0][4] = "Compiler";
            questions[0][5] = "b";

            questions[1][0] = "What is the process of finding and fixing errors in a program called?";
            questions[1][1] = "Compilation";
            questions[1][2] = "Execution";
            questions[1][3] = "Debugging";
            questions[1][4] = "Optimization";
            questions[1][5] = "c";

            questions[2][0] = "What is the main function of an operating system?";
            questions[2][1] = "Handling user interfaces";
            questions[2][2] = "Managing hardware resources";
            questions[2][3] = "Creating web applications";
            questions[2][4] = "Performing data analysis";
            questions[2][5] = "b";

            questions[3][0] = "What is the term for a collection of related data items that can be accessed individually or as a group?";
            questions[3][1] = "Database";
            questions[3][2] = "Variable";
            questions[3][3] = "Function";
            questions[3][4] = "Array";
            questions[3][5] = "d";

            questions[4][0] = "What does HTML stand for in web development?";
            questions[4][1] = "Hypertext Markup Language";
            questions[4][2] = "High-level Machine Language";
            questions[4][3] = "Hypermedia Transfer Protocol";
            questions[4][4] = "Hierarchical Text Modeling Language";
            questions[4][5] = "a";

            questions[5][0] = "What is the term for a program that translates high-level programming code into machine code?";
            questions[5][1] = "Interpreter";
            questions[5][2] = "Compiler";
            questions[5][3] = "Debugger";
            questions[5][4] = "Code editor";
            questions[5][5] = "b";

            questions[6][0] = "What is the primary purpose of a compiler?";
            questions[6][1] = "Executing programs";
            questions[6][2] = "Debugging code";
            questions[6][3] = "Analyzing data";
            questions[6][4] = "Translating code into machine language";
            questions[6][5] = "d";

            questions[7][0] = "What does CPU stand for in computer hardware?";
            questions[7][1] = "Central Processing Unit";
            questions[7][2] = "Computer Processing Unit";
            questions[7][3] = "Core Processing Unit";
            questions[7][4] = "Control Processing Unit";
            questions[7][5] = "a";

            questions[8][0] = "What is the binary system?";
            questions[8][1] = "Base-10 number system";
            questions[8][2] = "Base-2 number system";
            questions[8][3] = "Base-16 number system";
            questions[8][4] = "Base-8 number system";
            questions[8][5] = "b";

            questions[9][0] = "What is the term for a small piece of code that performs a specific task and can be reused?";
            questions[9][1] = "Procedure";
            questions[9][2] = "Function";
            questions[9][3] = "Variable";
            questions[9][4] = "Class";
            questions[9][5] = "b";

            answer[0][0] = "b";
            answer[0][1] = "High-level";

            answer[1][0] = "c";
            answer[1][1] = "Debugging";

            answer[2][0] = "b";
            answer[2][1] = "Managing hardware resources";

            answer[3][0] = "d";
            answer[3][1] = "Array";

            answer[4][0] = "a";
            answer[4][1] = "Hypertext Markup Language";

            answer[5][0] = "b";
            answer[5][1] = "Compiler";

            answer[6][0] = "d";
            answer[6][1] = "Translating code into machine language";

            answer[7][0] = "a";
            answer[7][1] = "Central Processing Unit";

            answer[8][0] = "b";
            answer[8][1] = "Base-2 number system";

            answer[9][0] = "b";
            answer[9][1] = "Function";

            opt1 = new JRadioButton();
            opt1.setBounds(170, 520, 700, 30);
            opt1.setBackground(Color.WHITE);
            opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
            add(opt1);

            opt2 = new JRadioButton();
            opt2.setBounds(170, 560, 700, 30);
            opt2.setBackground(Color.WHITE);
            opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
            add(opt2);

            opt3 = new JRadioButton();
            opt3.setBounds(170, 600, 700, 30);
            opt3.setBackground(Color.WHITE);
            opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
            add(opt3);

            opt4 = new JRadioButton();
            opt4.setBounds(170, 640, 700, 30);
            opt4.setBackground(Color.WHITE);
            opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
            add(opt4);


            groupoption = new ButtonGroup();
            groupoption.add(opt1);
            groupoption.add(opt2);
            groupoption.add(opt3);
            groupoption.add(opt4);

            next = new JButton("Next");
            next.setBounds(1100, 550, 200, 40);
            next.setFont(new Font("Tahoma", Font.PLAIN, 22));
            next.setBackground(Color.MAGENTA);
            next.setForeground(Color.WHITE);
            next.addActionListener(this);
            add(next);

            help = new JButton("Help");
            help.setBounds(1100, 630, 200, 40);
            help.setFont(new Font("Tahoma", Font.PLAIN, 22));
            help.setBackground(Color.MAGENTA);
            help.setForeground(Color.WHITE);
            help.addActionListener(this);
            add(help);

            submit = new JButton("Submit");
            submit.setBounds(1100, 710, 200, 40);
            submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
            submit.setBackground(Color.MAGENTA);
            submit.setForeground(Color.WHITE);
            submit.addActionListener(this);
            submit.setEnabled(false);
            add(submit);

            start(count);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == next) {
                repaint();
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                opt4.setEnabled(true);
                ans_given = 1;
                if (groupoption.getSelection() == null) {
                    user_answers[count][0] = "";
                } else {
                    user_answers[count][0] = groupoption.getSelection().getActionCommand();

                }

                if (count == 8) {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                count++;
                start(count);
            } else if (ae.getSource() == help) {
                if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                    opt2.setEnabled(false);
                    opt3.setEnabled(false);
                } else {
                    opt1.setEnabled(false);
                    opt4.setEnabled(false);
                }
                help.setEnabled(false);
            } else if(ae.getSource()==submit){
                ans_given =1;
                if (groupoption.getSelection() == null) {
                    user_answers[count][0] = "";
                } else {
                    user_answers[count][0] = groupoption.getSelection().getActionCommand();
                }

                for (int i=0; i< user_answers.length;i++){
                    if (user_answers[i][0].equals(answer[i][1])){
                        score +=10;
                    }else{
                        score +=0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            }
        }

        public void paint(Graphics g) {
            super.paint(g);

            String time = "Time left :  " + timer + " seconds";
            g.setColor(Color.MAGENTA);
            g.setFont(new Font("Tahoma", Font.BOLD, 25));

            if (timer > 0) {
                g.drawString(time, 1100, 500);
            } else {
                g.drawString("Time up", 1100, 500);
            }

            timer--;

            try {
                Thread.sleep(1000);
                repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (ans_given == 1) {
                ans_given = 0;
                timer = 20;
            } else if (timer < 0) {
                timer = 20;
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                opt4.setEnabled(true);

                if (count==8){
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                if (count==9){
                    if (groupoption.getSelection() == null) {
                        user_answers[count][0] = "";
                    } else {
                        user_answers[count][0] = groupoption.getSelection().getActionCommand();
                    }

                    for (int i=0; i< user_answers.length;i++){
                        if (user_answers[i][0].equals(answer[i][1])){
                            score +=10;
                        }else{
                            score +=0;
                        }
                    }
                    setVisible(false);
                    new Score(name, score);

                }else {
                    if (groupoption.getSelection() == null) {
                        user_answers[count][0] = "";
                    } else {
                        user_answers[count][0] = groupoption.getSelection().getActionCommand();
                    }
                    count++;
                    start(count);
                }
            }

        }

        public static void start(int count){
        qno.setText(""+(count +1)+".");
        question.setText(questions[count] [0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
            opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
            opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
            opt4.setActionCommand(questions[count][4]);

            groupoption.clearSelection();
        }


    public static void main(String[] args){
        new Quiz("user");
    }
}
