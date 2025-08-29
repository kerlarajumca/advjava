import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class lbltextdemo implements ActionListener{
    public static void main(String args[])
    {
        JFrame jf=new JFrame("text demo");
        JLabel lbl1=new JLabel("Enter your name");
        JTextField txt1=new JTextField(30);
        JButton btn1=new JButton("Click me");
        btn1.setSize(50,50);
        btn1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e) {
            String s1=txt1.getText();
            lbl1.setText("Hello Mr"+s1);
         }          
        }); 

        jf.setSize(400,250);
        jf.setLayout(new FlowLayout());
        jf.add(lbl1);
        jf.add(txt1);
        jf.add(btn1);
        jf.setVisible(true);
    }
}
