import java.awt.Color;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
public class spring_layout {
    public static void main(String args[])
    {
        JFrame myframe=new JFrame("Spring layout demo");
        myframe.setLocation(50,0);
        myframe.setSize(400,250);
        SpringLayout S=new SpringLayout();
        
        myframe.getContentPane().setLayout(S);

        JLabel lbl1=new JLabel("line1");
        lbl1.setForeground(Color.ORANGE);
        lbl1.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl2=new JLabel("line2");
        lbl2.setForeground(Color.red);
        lbl2.setBorder(new EmptyBorder(5,5,5,5));

        JLabel lbl3=new JLabel("Line3");
        lbl3.setForeground(Color.blue);
        lbl3.setBorder(new EmptyBorder(5,5,5,5));

       
        S.putConstraint(SpringLayout.WEST, lbl1, 5,SpringLayout.WEST,myframe);
        S.putConstraint(SpringLayout.NORTH, lbl1, 5,SpringLayout.NORTH,myframe);
        S.putConstraint(SpringLayout.WEST, lbl2, 20,SpringLayout.WEST,myframe);
        S.putConstraint(SpringLayout.NORTH, lbl2, 20,SpringLayout.NORTH,myframe);
        S.putConstraint(SpringLayout.WEST, lbl3, 5,SpringLayout.WEST,myframe);
                S.putConstraint(SpringLayout.NORTH, lbl3, 40,SpringLayout.NORTH,myframe);
        myframe.add(lbl1);
        myframe.add(lbl2);
        myframe.add(lbl3);

        myframe.setVisible(true);

    }
}
