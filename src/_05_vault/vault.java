package _05_vault;

import java.util.Random;

public class vault {
	
	Random mikejohnson=new Random();
	int code=mikejohnson.nextInt(10000000);
	boolean trycode(int guess) {
		if(guess==(code)) {
			return true;
		}
		else {
		return false;}
	}
public static void main(String[] args) {
	bond bond=new bond();
	System.out.println(bond.findCode());
}
}
