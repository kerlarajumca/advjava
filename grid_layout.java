import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
public class grid_layout {
    public static void main(String args[])
    {
        JFrame myframe=new JFrame("grid layout demo");
        myframe.setLocation(50,0);
        myframe.setSize(400,250);
        
        JLabel lbl1=new JLabel("line1");
        lbl1.setForeground(Color.ORANGE);
        lbl1.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl2=new JLabel("line2");
        lbl2.setForeground(Color.red);
        lbl2.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl3=new JLabel("Line3");
        lbl3.setForeground(Color.blue);
        lbl3.setBorder(new EmptyBorder(5,5,5,5));

        myframe.setLayout(new GridLayout(1,3));
        myframe.add(lbl1);
        myframe.add(lbl2);
        myframe.add(lbl3);

        myframe.setVisible(true);

    }
}
