package day4;

public class Practice1_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =20;
		for(int i=1;i<=num;i++) {
			if(num==i) {
				System.out.println(i);
			}
		else if(num%i==0) {
				System.out.print(i +",");
			}
		}
	}

}
