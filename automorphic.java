import java.util.Scanner;
class automorphic
{
	public static void main(String args[])
	{   int r,count,sum=0,i,num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number to be checked= ");
		num= s.nextInt();
		String str= Integer.toString(num);
		count=str.length();
		long prod= num* num;
		for(i=1;i<=count;i++)
		{  r=(int)(prod%10);
	       prod=prod/10;
		   	sum = (sum*10) + r;
		}
		int rev=0;
		while(sum>0)
		{
			r=sum%10;
			sum=sum/10;
			rev=(rev*10)+r;
		}
		
		if(rev==num)
		{
			System.out.println("Number is automorphic");
		}
		else
			System.out.println("Not automorphic");
		
	}
}