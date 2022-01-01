class hashCode
{
	public static void main(String []args)
	{
		String str= "Hello";
		System.out.println("Hash code test using String...");
		System.out.println(str.hashCode());
		str+=" world";
		System.out.println(str.hashCode());
		
		StringBuffer sb= new StringBuffer("java");
		System.out.println("Hash code test using StringBuffer...");
		System.out.println(sb.hashCode());
		sb.append(" swing");
		System.out.println(sb.hashCode());
	}
}	