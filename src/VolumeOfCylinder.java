import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String args[])
	{
		int r,h;
		double  volume,pi=3.14;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter radius and height of cylinder");
		r=sr.nextInt();
		h=sr.nextInt();
		volume=2*pi*r*h;
		System.out.println(volume);
	}

}
