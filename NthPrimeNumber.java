package nthPrimeNumber;
import java.util.Scanner;
public class NthPrimeNumber 
{   public static void main(String[] args)
  {
	int n,count=1,num=2,primeNo=2,flag;
	Scanner s=new Scanner(System.in);
	System.out.println("which prime number you want ot check = ");
	n=s.nextInt();
	while(count<=n)
		{  flag=0;
		   for(int i=2;i<=num/2;i++)
		   {
			   if(num%i == 0)
			   {
				   flag=1;
				   break;
			   }
		   }
		   if(flag==0)
		   {
			   primeNo=num;
			   count++;
		   }
		   num++;
		   
		}
	System.out.println("Nth prime number is = " + primeNo);
  }
	

}
