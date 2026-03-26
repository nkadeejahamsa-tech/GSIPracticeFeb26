package day3;

public class Program5_Multiples2and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =1;
while(num<=15) {
	int multi = num*2;
	if(multi%3==0 && multi%10!=0) {
		System.out.println("Hello");}
	else if(multi%10==0) {System.out.println("Bye");}
	else
	{
		System.out.println(multi);
	
	}
	num++;
}


	}

}
