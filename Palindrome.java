import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args)
	{
		int sum=0,r;
		int n;
		Scanner k = new Scanner (System.in);
		System.out.println("Enter a no.");
		int a = k.nextInt();
		n=a;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==a)
			System.out.println("its a palindrome");
		else
			System.out.println("its not a palin");
	}
}