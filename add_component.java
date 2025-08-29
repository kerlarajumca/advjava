import java.awt.Color;
import javax.swing.*;
public class add_component {
    public static void main(String args[])
    {
        JFrame myframe=new JFrame("Frame with Label");
        myframe.setLocation(50,0);
        myframe.setSize(300,400);

        JLabel lbl1=new JLabel("Welcome to Swing programming");
        lbl1.setForeground(Color.ORANGE);

        myframe.add(lbl1);
        myframe.setVisible(true);

    }
}
