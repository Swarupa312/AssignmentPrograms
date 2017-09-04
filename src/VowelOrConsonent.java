import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String args[]) throws Exception{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character");
		c=(char) br.read();
		switch(c)
		{
		case 'a':System.out.println("Vowel");
		break;
		case 'e':System.out.println("Vowel");
		break;
		case 'i':System.out.println("Vowel");
		break;
		case 'o':System.out.println("Vowel");
		break;
		case 'u':System.out.println("Vowel");
		break;
	default :System.out.println("Consosnent");
	break;
		
		}
		
	}
}
