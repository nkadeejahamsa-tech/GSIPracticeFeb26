package day12;

import java.util.Stack;


public class Program3_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="[][][][]]";
int flag=0;
Stack<Character> st = new Stack<Character>();
for(int i =0;i<str.length();i++) {
	if(str.charAt(i)=='[') {
		st.push(str.charAt(i));
	}
	else {
		if(st.isEmpty()) {
			flag=1;
			break;
		}
		else {
			st.pop();
		}
	}
}
if(flag==1) {
	System.out.println("Not balanced -More closing");
}
else if (!st.isEmpty()) {
	System.out.println("Not balanced - More opening");
}
else {
	System.out.println("Balanced");
}
	}

}
