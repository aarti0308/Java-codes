class fibbo
{
	public static void main(String[] args)
	{
		System.out.println("Fibbonaci series...");
		System.out.print(0+" "+1+ " ");
		int a=0,b=1,s=0;
		for(int i=1;i<=10;i++)
		{
			s=a+b;
			a=b;
			b=s;
			System.out.print(s+" ");
		}
	}
}