import java.util.Scanner;

public class MembersClass 
{
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("ENter stduent id");
		int sid=sr.nextInt();
		System.out.println("enter name");
				String sname=sr.next();
				A a=new A(sid,sname);
				a.show();
	}
}
class A{
	int id;
	String name;
	public A(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public void show(){
		System.out.println(id);
		System.out.println(name);
	}
}