package ShortingAlgorithm;

public abstract class recursiveFact {

	public static void main(String[] args) {
	
	System.out.println(recursiveFactorial(0));
		
	}
	public static int recursiveFactorial(int number)
	{
		if(number==0)
		{
			return 1;
		}
		return number*recursiveFactorial(number-1);
	
	}
}
