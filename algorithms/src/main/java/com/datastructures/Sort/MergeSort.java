package com.datastructures.Sort;

public class MergeSort {
	
	
	public void merge(int[] input, int l, int m, int h) {
		
		int n1 = m-l+1;
		int n2 = h-m;
		
		int L1[] = new int[n1];
		int L2[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L1[i]=input[l+i];
		}
		
		for(int j=0; j<n2; j++) {
			L2[j]=input[m+1+j];
		}
		
		int k =l;
		int i=0;
		int j=0;
		while(i<n1 && j<n2) {
			if(L1[i]<=L2[j]) {
				input[k]=L1[i];
				i=i+1;
				k=k+1;
			}else {
				input[k]=L2[j];
				j=j+1;
				k=k+1;
			}
		}
		
		while(i<n1) {
			input[k] = L1[i];
			i=i+1;
			k++;
		}
		while(j<n2) {
			input[k]=L2[j];
			j=j+1;
			k++;
		}
		
	}
	
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
	
	
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.divide(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
    
    
	
	public int[] divide(int[] input, int l, int h) {
		    if(l<h) {
		    	int m = (l+h)/2;
		    	divide(input, l, m);
		    	divide(input, m+1, h);
		    	merge(input, l, m, h);
		    }
			return input;
    }

}
