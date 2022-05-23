package ShortingAlgorithm;

public class insertionShorting {

	public static void main(String[] args) {
		int[] shortArray= {23,11,-43,65,34};
		System.out.println("Before shorting the array : ");
	
		for (int a : shortArray) {
			System.out.print(" "+a+" ");
		}
		System.out.println();
		System.out.println("After shorting the array : ");
		// Assume that the '0'th element already sorted.
		for(int firstUnshortedArray=1;firstUnshortedArray<shortArray.length;firstUnshortedArray++)
		{
			int newElement=shortArray[firstUnshortedArray];
			int i;
			for (i= firstUnshortedArray; i>0 && shortArray[i-1]>newElement; i--) 
			{
				shortArray[i]=shortArray[i-1];
//				System.out.println(i);
			}
			//System.out.println("--"+i+"--");
			shortArray[i]=newElement;
		}
		for (int ab : shortArray) {
			System.out.print(" "+ab+" ");
		}
	}

}
