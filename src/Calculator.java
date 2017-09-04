import java.util.Scanner;

public class Calculator
{
public static void main(String args[])
{
	Scanner sr=new Scanner(System.in);
	System.out.println("Enter  nos");
	int a=sr.nextInt();
	assert a>=0:"Enter valid number";
	int b=sr.nextInt();
	assert b>=0:"Enter valid number";
	System.out.println("1:Add 2:Subtract 3: Divide 4:Multiply");
	System.out.println("Enter the opearotor");
	int op=sr.nextInt();
	switch(op)
	{
	case 1: System.out.println(a+b);break;
	case 2: System.out.println(a-b);break;
	case 3: System.out.println(a/b);break;
	case 4: System.out.println(a*b);break;
	}
	
	
}
}
