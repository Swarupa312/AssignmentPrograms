import java.util.Scanner;

public class TemperatueConversion {
	public static void main(String args[]){
		int c,f;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter temp in celsius");
		c=sr.nextInt();
		f=c*9/5+32;
		System.out.println("Temp in fahrenheit="+f);
	}

}
