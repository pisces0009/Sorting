package Sorting;

//import java.util.*;

public class Merge {
	
	 void mergeSort(int A[], int p, int q, int r)
	    {
	        // Find sizes of two subarrays
	        int n1 = q - p + 1;
	        int n2 = r - q;
	 
	        //new arrays
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	 
	        //Copy data to l,r arrays
	        for (int i=0; i<n1; ++i)
	            L[i] = A[p + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = A[q + 1+ j];
	 
	 
	        /* Merge l,r arrays */
	 
	        // Initial indexes
	        int i = 0, j = 0;
	 
	        
	        int k = p;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                A[k] = L[i];
	                i++;
	            }
	            else
	            {
	                A[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        //Copy remaining elements of L[] & R[] if any
	        while (i < n1)
	        {
	            A[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        
	        while (j < n2)
	        {
	            A[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	
	void sort (int []A, int p, int r) {
		
		if (p < r)
        {
            // Find the mid
            int q = (p+r)/2;
 
            // Sort first and second halves
            sort(A, p, q);
            sort(A , q+1, r);
 
            // Merge the sorted halves
            mergeSort(A, p, q, r);
        }
			
	}
	
	 static void printArray(int []A)
	    {
	        int n = A.length;
	        for (int j=0; j<n; ++j)
	            System.out.print(A[j] + " ");
	        System.out.println();
	    }

	public static void main(String[] args) {
		
		int A[] = {30, 13, 1, 9, 0, 2, 25};
		 
        System.out.println("Given Array");
        printArray(A);
 
        Merge ob = new Merge();
        ob.sort(A, 0, A.length-1);
 
        System.out.println("\nSorted array");
        printArray(A);
		

	}

}
