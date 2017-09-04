package Areas;

import java.util.Scanner;

public class Rectangle extends Area

{
	
		Scanner sr=new Scanner(System.in);

		@Override
		public void area() {
			System.out.println("Enter length and breadth");
			int length=sr.nextInt();
			int breadth=sr.nextInt();
			area=length*breadth;
			System.out.println(area);
			
			
		}
		
}
