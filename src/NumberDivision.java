import java.util.Scanner;

public class NumberDivision 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter two nos:");
		a=sr.nextInt();
		b=sr.nextInt();
		if(a%b==0){
			System.out.println("Yes Divisible");
		}
		else{
			System.out.println("Not Divisible");
		}
	}
}
