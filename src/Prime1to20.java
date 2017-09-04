
public class Prime1to20 {
public static void main(String args[])
{
	boolean flag=true;
	for(int i=1;i<=20;i++)
	{
		flag=true;
		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
			{
				flag=false;
			}
			
		}
		if(flag==true)
		{
			System.out.println(i);
		}
	}
}
}
