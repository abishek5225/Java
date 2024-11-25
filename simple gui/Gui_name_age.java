import javax.swing.JOptionPane;
public class Gui_name_age {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Thank you for visiting us Please follow our instructions");
        String name = JOptionPane.showInputDialog("Enter your name");
        String age = JOptionPane.showInputDialog("Enter your age");
        String Gender = JOptionPane.showInputDialog("Enter your Gender");
        String hello = JOptionPane.showInputDialog("Enter your Grade");
        String yoyo= JOptionPane.showInputDialog("Enter your roll no:");


        JOptionPane.showMessageDialog(null,"Hello "+name+" WELCOME \n You are in grade"+hello+"\n your roll no is"+yoyo);

    }
}
