package day3;

public class Program4_alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char upc = 'A';
		char lwc= 'a';
		while(upc<='Z' && lwc<='z') {
			System.out.println(upc+""+lwc);
			upc++;
			lwc++;
		}

	}

}
