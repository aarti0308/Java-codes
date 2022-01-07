class reverseNumber
{
	public static void main(String[] args)
	{
		int num=4080,r,sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=(sum*10)+r;
		}
		
		System.out.println("Number = " + sum);
	}
}