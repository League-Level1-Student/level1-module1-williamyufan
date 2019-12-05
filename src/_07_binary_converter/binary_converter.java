package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements  ActionListener 
{JFrame j=new JFrame();
JPanel t=new JPanel();
JTextField f=new JTextField(60);
JLabel y=new JLabel();

JButton tt=new JButton();


public static void main(String[] args) {
	binary_converter j=new binary_converter();
	j.type();
}
void type(){
	tt.addActionListener( this);
	j.setVisible(true);
	j.add(t);
	t.add(f);
	t.add(y);
	t.add(tt);
	j.pack();
	
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	convert(y1.getText());
	
}
}
