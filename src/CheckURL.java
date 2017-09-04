import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckURL 
{
	public static void main(String args[]){
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter String");
		String url=sr.next();
		boolean flag=Pattern.matches("/[a-z]*:", "url");
		if(flag)
			System.out.println("yes");
		else
		System.out.println("no");
	}
}
