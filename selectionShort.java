package ShortingAlgorithm;

import java.util.Iterator;

public class selectionShort {

	public static void main(String[] args) {
		int[] shortArray= {13,15,-7,68,34,28,-23,52};
		System.out.println("Before shorting the array : ");
	
		for (int a : shortArray) {
			System.out.print(" "+a+" ");
		}
		System.out.println();
		System.out.println("After shorting the array : ");
		

		for (int unshortArray = shortArray.length-1; unshortArray >0 ; unshortArray--) 
		{
			
			int bigValue=0;	
		for (int j = 1; j < unshortArray; j++)
		{
			
			if (shortArray[j]>shortArray[bigValue])
			{
				bigValue=j;
			}
		}	
		swap(shortArray,bigValue,unshortArray);
		}
		for (int ab : shortArray) {
			System.out.print(" "+ab);
		}
		
		}
	
	public static void swap(int[] shortArray,int i, int j)
	{
		int temp=shortArray[i];
		shortArray[i]=shortArray[j];
		shortArray[j]=temp;
	}
	}


