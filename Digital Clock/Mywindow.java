import javax.swing.*;
import java.awt.*;

public class Mywindow extends JFrame{
    private JLabel heading;
    private JLabel clockLabel;
    private Font font =new Font("",Font.BOLD,size:35);
    Mywindow(){
        super.setTitle(" Digital Clock");
        super.setSize(500,500);
        super.setLocation(500,300);

        super.setVisible(true);
    }
    public void createGUI(){

    }
}
