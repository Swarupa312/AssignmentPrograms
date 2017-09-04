import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainReservation {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		int usertainid,person,finalamt;
		String cname;
		Set<Train> trainset=new LinkedHashSet<Train>();
		Train t1=new Train(1,"Pune","Kolhapur",1000);
		Train t2=new Train(2,"Mumbai","Kolhapur",2000);
		Train t3=new Train(3,"Pune","Nashik",500);
		Train t4=new Train(4,"Pune","Banglore",2500);
		Train t5=new Train(5,"Chennai","Kolhapur",1000);
		Train t6=new Train(6,"Delhi","Nagpur",4500);
		trainset.add(t1);
		System.out.println("Enter tarin id");
		usertainid=sr.nextInt();
		for(Train t:trainset)
		if(usertainid==t.tid)
		{
			System.out.println("Enter name");
			cname=sr.next();
			System.out.println("Enter no of person");
			person=sr.nextInt();
			finalamt=(int) (person*t.amount);
			t1.display(t.tid, t.source, t.dest, cname, person, finalamt);
		}
		else
		{
			System.out.println("No train available");
		}
		
	}

}
class Train{
	int tid;
	String source,dest;
	double amount;
	public Train(int tid, String source, String dest, double amount) {
	
		this.tid = tid;
		this.source = source;
		this.dest = dest;
		this.amount = amount;
	}
	public void display(int tid,String source, String dest,String name,int person,int amt){
		System.out.println(tid);
		System.out.println(source);
		System.out.println(dest);
		System.out.println(name);
		System.out.println(amt);
		System.out.println(person);
		
	}
	
	
}