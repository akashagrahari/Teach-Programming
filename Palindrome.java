/*This program checkes if the entered string is a palindrome*/
import java.util.Scanner;
public class Palindrome {
	static int size;
	static int x,p;
	static String str;
	static int flag=1;
	public static void main(String args[]) {
		Scanner user_input = new Scanner( System.in );
		System.out.println("Enter a string.");
		str = user_input.next();
		size=str.length();
			x=0;
			while(x<size&&flag==1){
				if (str.charAt(x)!=str.charAt(size-x-1))
				flag=0;
				x++;
			}
		if (flag==1){
			System.out.println("The entered string is a palindrome.");
		}
		else{
			System.out.println("The entered string is NOT a palindrome.");
		}
	}
}