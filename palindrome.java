import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int num,r,sum=0,temp;
		System.out.print("Enter the number to be checked= ");
		num=s.nextInt();
		temp=num;
		while(num > 0)
		{
			r=num%10;
			num= num /10;
			sum= (sum * 10) + r;
		}
		if(sum==temp)
			System.out.println("Number is palindrome...");
		else System.out.println("Numbe is  not palindrome...");
		
	}
}