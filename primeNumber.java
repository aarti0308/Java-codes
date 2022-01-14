import java.util.Scanner;
class primeNumber
{
	public static void main(String[] args)
	{    int num,ch,flag=0;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.print("Enter the number to be searched= ");
			num=s.nextInt();
			for(int i=2;i<=(num/2) ;i++)
			{
				if(num%i == 0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			System.out.println(num+" is not prime");
		    else
		    System.out.println(num+ " is prime");
		   System.out.println("Do you want to enter more(press 1 for yes and other key to exit )= ");
		   ch=s.nextInt();
		}while(ch==1);
	}
}