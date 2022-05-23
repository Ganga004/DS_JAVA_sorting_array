package ShortingAlgorithm;

public class bubbleShorting {
	
	public static void swapValues(int[] shortArray,int i,int j)
	{
		
		{
			int temp=shortArray[i];
			shortArray[i]=shortArray[j];
			shortArray[j]=temp;
		}
	}

	public static void main(String[] args) {
		int[] shortArray= {43,15,-7,65,34,23,-23,52};
		System.out.println("Before shorting the array : ");
	
		for (int a : shortArray) {
			System.out.print(" "+a+" ");
		}	
		System.out.println();
		System.out.println("After shorting the array : ");
		
		for (int unshortArray = shortArray.length-1; unshortArray >0 ; unshortArray--) 
		{
		for (int j = 0; j < unshortArray; j++)
		{
			if (shortArray[j]>shortArray[j+1])	
			swapValues(shortArray,j,j+1);	
		}	
			
		}
		for (int ab : shortArray) {
			System.out.print(" "+ab);
		}
	}

}
