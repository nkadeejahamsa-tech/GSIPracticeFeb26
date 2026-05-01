package day11;

import java.util.Arrays;

public class Program4_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Today is a warm day";
		StringBuilder finalString = new StringBuilder();
		String[] splittings = word.split(" ");
		for (String splitting : splittings) {
			StringBuilder sb2 = new StringBuilder(splitting).reverse();
			finalString = finalString.append(sb2).append(" ");
		}
		String result = finalString.toString().trim();
//
//		for(int i =0;i<splittings.length;i++) {
//		StringBuilder sb2=new StringBuilder(splittings[i]+"").reverse();
//		finalString=finalString+sb2+" ";
//		}
		System.out.println(result);

//

//String reversed = new StringBuilder(word).reverse().toString();
//System.out.println(word);
	}

}
