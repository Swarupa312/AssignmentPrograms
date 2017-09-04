import java.util.Scanner;

public class DistanceCal {
	public static void main(String args[])
	{
		int u=0;
		int a,t;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the accelearation in mps and time in s");
		a=sr.nextInt();
		t=sr.nextInt();
		float result=u*t+a*t*t/2;
		System.out.println(result);
	}

}
