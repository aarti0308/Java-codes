package peterson;
import java.util.Scanner;
public class peterson 
{   public static int fact(int num)
	{
	   if(num==0)
		   return 1;
	   else
		   return(num*fact(num-1));
	}
	public static void main(String[] args)
	{
		int num,r,sum=0,fact;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to be checked= ");
		num=s.nextInt();
		int temp=num;
		while(temp>0)
		{
			r=temp%10;
			temp=temp/10;
			sum=sum + fact(r);
		}
		if(sum==num)
		   System.out.println("Peterson number...");
		else
			System.out.println("Not a peterson number...");
	}

}
