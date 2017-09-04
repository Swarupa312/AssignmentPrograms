package Areas;

import java.util.Scanner;

public class Square extends Area

{
	
		Scanner sr=new Scanner(System.in);

		@Override
		public void area() {
			System.out.println("Enter side");
			int side=sr.nextInt();
			
			area=side*side;
			System.out.println(area);
			
			
		} 
}