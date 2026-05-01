package day10;

import java.util.Arrays;

public class Program3_VowelCountinaString {

	public static void main(String[] args) {
		int count =0;
		// TODO Auto-generated method stub
		String s = "Today is Tuesday";
String newString = s.toLowerCase();
//BELOW IS CONVERTING TO ARRAY ENTIRELY USING TOCHARARRAY
//char arr[]=newString.toCharArray();
//System.out.println(Arrays.toString(arr));
//for(int i =0;i<arr.length;i++) {
//	if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u')) {
//		count++;
//	}
//}
//using charAt
for(int i=0;i<=newString.length()-1;i++) {
	if((newString.charAt(i)=='a'||newString.charAt(i)=='e'||newString.charAt(i)=='i'||newString.charAt(i)=='o'||newString.charAt(i)=='u')){
		count++;
	}
}
System.out.println(count);
	}

}
