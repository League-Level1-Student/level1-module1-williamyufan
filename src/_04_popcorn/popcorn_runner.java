package _04_popcorn;

import javax.swing.JOptionPane;

public class popcorn_runner {
public static void main(String[] args) {
String y=	JOptionPane.showInputDialog("What flavor do you want?");
	String j=JOptionPane.showInputDialog("How many minutes do you want the popcorn to be cocked?");
	int u=Integer.parseInt(j);
	Popcorn n=new Popcorn(y);
	Microwave b=new Microwave();
	b.putInMicrowave(n);
	b.setTime(u);
	b.startMicrowave();
}
}
