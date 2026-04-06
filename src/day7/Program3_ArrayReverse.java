package day7;

public class Program3_ArrayReverse {
	public static void reverse(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};

reverse(arr);
}

}
