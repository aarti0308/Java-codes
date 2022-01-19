import java.lang.Math;
import java.util.Scanner;
class armstrong
{
	public static void main(String[] args)
	{
		int num,r,temp;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked= ");
		num=sc.nextInt();
		String str=Integer.toString(num);
		int length=str.length();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum= sum + Math.pow(r,length);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Number is armstrong...");
		else 
			System.out.println("number is not armstring...");
	}
}