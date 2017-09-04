import java.util.Scanner;

public class WordStartEnd
{
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enetr a word");
		String str=sr.next();
		if(str.length()<=3)
		{
			if(str.startsWith("a")||str.startsWith("b")||str.startsWith("c")){
				if(str.endsWith("at"))
				System.out.println("Matched");
			}
			else{
				
			System.out.println("Not mathed");
		}
		}
		else
		{
			System.out.println("Only 3 letter word");
		}

	}
}
