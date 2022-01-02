class BP9
{
	public static void main(String[] args)
	{
		int i,j;
		for (i=1;i<=7;i++)
		{
			for(int k=1;k<=6;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(i=1;i<=7;i++)
		{   int k=1;
			for(j=1;j<=7;j++)
			{
				if(i+j > 7)
				{
					System.out.print(k);
					k++;
				}	
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}