import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeDetails {
public static void main(String args[]) throws IOException{
	int ch;
	Set<Employee>emplist=new LinkedHashSet<Employee>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	do{
		System.out.println("a:Insert b:display c:exit");
	System.out.println("Enter your choice");
	int a=br.read();
	
	
	switch(a)
	{
	case 1:
	{
		System.out.println("enter eid,salary ,name,address,desgS");
		int id=br.read();
		int sal=br.read();
		String ename=br.readLine();
		String add=br.readLine();
		String des=br.readLine();
		Employee emp=new Employee(id,sal,ename,add,des);
		emplist.add(emp);
		break;
	}
	case 2:
	{
		if(emplist.size()==0)
		{
			System.out.println("No record");
		}
		else
		{
				System.out.println("1:All emp details or 2:perticular");
		
		
		int choice=br.read();
		if(choice==1)
		{
			for(Employee e:emplist)
		{
			System.out.println(e.name);
			System.out.println(e.address);
			System.out.println(e.salary);
			System.out.println(e.desg);
		}
		}
		
		else
		{
			System.out.println("Enter id");
			int searchid=br.read();
			for(Employee e1:emplist)
			{
			if(searchid==e1.eid)
			{
			System.out.println(e1.name);
			System.out.println(e1.address);
			System.out.println(e1.salary);
			System.out.println(e1.desg);
			}
			}
		}
		}
		break;
	}
	case 3:{
		
		System.exit(0);
	
	break;
	}
	}
	System.out.println("do you want to continue");
	ch=br.read();
	}while(ch==1);
}

}
class Employee
{
	int eid,salary;
	public Employee(int eid, int salary, String name, String address, String desg) {
		
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.desg = desg;
	}
	String name,address,desg;
	
}