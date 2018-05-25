package Insertion;

import java.util.*;

public class InsertionSort {
	

	void sort(int A[])
	{
		int a = A.length;
		for (int j=1; j<a; ++j)
		{
			int key = A[j];
			int i = j-1;

			while (i>=0 && A[i] > key)
			{
				A[i+1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
			
		}
	}

	
	static void printArray(int A[])
	{
		int a = A.length;
		for (int j=0; j<a; ++j)
			System.out.print(A[j] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
	
		int A[] = {3, 10, 1, 5, 1, 7, 6, 0};

		InsertionSort ob = new InsertionSort();	 
		ob.sort(A);
		
		printArray(A);
			

	}

}
