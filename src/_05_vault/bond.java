package _05_vault;

public class bond {
	vault vault=new vault();

	int findCode() {
		for (int x = 0; x < 10000000; x++) {
			if (vault.trycode(x)) {
				return x;
			}
		}
		return -1;

	}
}