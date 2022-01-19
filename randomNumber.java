import java.util.Random;
class randomNumber
{
	public static void main(String[] args)
	{    //does not use random class
		System.out.println("Random number using Math.random() = "+ Math.random());
		//random number berween a range (min value inclded while max value is excluded)
		//does not us random class
		int min=200,max=400;
		int a= (int)(Math.random()*(max-min+1)+min);
		System.out.println("Random value between 200-400 = "+a);
		//random number using Random class
		Random random= new Random();
		double x=random.nextDouble(); //0.0 to 1.0
		int y=random.nextInt(50);     //0 to 49
		System.out.println("Random double value using  random class= "+ x);
		System.out.println("Random integer value using  random class= "+ y);
	}
}