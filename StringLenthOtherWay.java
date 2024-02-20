package Level1;

import java.util.Iterator;

public class StringLenthOtherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "Hello Buddy!!";
		char c[]=abc.toCharArray();
		int count=0;
		
		for (int i = 0; i < c.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
