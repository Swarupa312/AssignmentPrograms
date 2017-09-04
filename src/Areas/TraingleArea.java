package Areas;

import java.util.Scanner;

public class TraingleArea  extends Area
{
	

	@Override
	public void area() {
		
			Scanner sr=new Scanner(System.in);
		
			int b,h;
			System.out.println("Enter height and base");
			h=sr.nextInt();
			b=sr.nextInt();
			area=b*h;
			System.out.println(area/2);
	}

}
