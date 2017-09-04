import java.util.ArrayList;
import java.util.Scanner;

public class Groccery 
{
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		String ch;
		ArrayList<Grocwght> glist=new ArrayList<Grocwght>();
		Grocwght gc=new Grocwght(10,"Sugar");
		Grocwght gc1=new Grocwght(10,"Rice");
		Grocwght gc2=new Grocwght(10,"Wheat");
		glist.add(gc);
		glist.add(gc1);
		glist.add(gc2);
		
		do{
			System.out.println("Enter the choice");
			System.out.println("1.add 2:display");
			int choice=sr.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter grocery");
		String gname=sr.next();
		for(int i=0;i<glist.size();i++)
		{
		if(glist.get(i).getName().equals(gname))
		{
			System.out.println("enter wight");
			int wt=sr.nextInt();
			System.out.println(glist.get(i).getWeight());
			glist.get(i).setWeight(wt+glist.get(i).getWeight());
			
			
		}
		}break;
		case 2:
		for(Grocwght g:glist)
		{
			System.out.println(g.getWeight()+g.getName());
		}break;
		}
		System.out.println("Do you want to continue");
		ch=sr.next();
	}while(ch=="y");
		
	}
}

	

class Grocwght{
	int weight;
	String name;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public Grocwght(int weight, String name) {
	
		this.weight = weight;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
