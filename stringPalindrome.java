import java.util.Scanner;
class stringPalindrome
{
	public static void main(String [] args)
	{
		Scanner s= new Scanner(System.in);
		String str=new String();
		String reverse="";
		System.out.print("Enter the number/String to be checked= ");
		str=s.nextLine();
		for(int i=(str.length() -1);i>=0;i--)
		{
			reverse=reverse + str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("Entered data is palindrome...");
		}
		else 
			System.out.println("Entered data is not palindrome...");
	}
}