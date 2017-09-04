package Areas;

import java.util.Scanner;

public class Circle extends Area
{

	@Override
	public void area() {
		
			Scanner sr=new Scanner(System.in);
			System.out.println("Entr radius");
			int radius=sr.nextInt();
			area=3.14*radius*radius;
			System.out.println(area);
		
	}

}
