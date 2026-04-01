package day4;

public class Program9_Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =3;
if(num==1) {
	System.out.println("Neither prime nor composite");
}
else if(num==2) {
	System.out.println("Prime");
}
else {
	boolean flag = true;
	for(int fact=3;fact<=Math.sqrt(num);fact=fact+2)
	{
		if(num%fact==0) {
			flag=false;
			System.out.println("Not prime");
			break;
		}
		
	}
	if(flag==true)
		System.out.println("Prime");
}
	}
}
