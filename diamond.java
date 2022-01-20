class diamond
{
	public  static void main(String[] args)
	{
		int i,j,k,row=6;
		for( i=0;i<=row/2; i++)
		{   
	        for(k =1;k<row-i;k++)
			{
				System.out.print(" ");
			}
			 for(j = 0; j<=i ; j++)
			 {	
         		 System.out.print("* ");
				 
			 }
			  System.out.println();
				 
		}	 
		
		for( i=(row/2) + 1;i>=0 ; i--)
		{    for(k=1;k<row-i;k++)
			{
				System.out.print(" ");
			}
			 for(j = 0; j<=i ; j++)
			 {
				  System.out.print("* ");
			 }
			  System.out.println();
				 
		}	
	}
}