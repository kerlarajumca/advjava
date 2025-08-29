import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
public class borderlayout {
    public static void main(String args[])
    {
        JFrame myframe=new JFrame("border layout demo");
        myframe.setLocation(50,0);
        myframe.setSize(300,300);
        
        JLabel lbl1=new JLabel("line1");
        lbl1.setForeground(Color.ORANGE);
        lbl1.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl2=new JLabel("line2");
        lbl2.setForeground(Color.red);
        lbl2.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl3=new JLabel("Line3");
        lbl3.setForeground(Color.blue);
        lbl3.setBorder(new EmptyBorder(5,5,5,5));

        myframe.add(lbl1,BorderLayout.EAST);
        myframe.add(lbl2,BorderLayout.SOUTH);
        myframe.add(lbl3,BorderLayout.NORTH);

        myframe.setVisible(true);

    }
}
