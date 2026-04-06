package dailyAssignments;

public class Apr01_NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i =5;i>0;i--) {
	for(int space=5;space>=i;space--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	System.out.println();

}
	}

}
