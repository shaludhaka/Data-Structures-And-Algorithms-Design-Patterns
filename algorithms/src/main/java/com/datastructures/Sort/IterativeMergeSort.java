package com.datastructures.Sort;

import java.util.Arrays;

public class IterativeMergeSort {
	
	
	public void sort(int[] input) {
		int[] temp = new int[input.length];
		for (int size=1;size<input.length; size=size*2) {
			for (int i=0; i<input.length; i=i+2*size) {
				int left = i;
				int mid = i+size;
				int right=i+2*size;
				merge(input, left, mid, right, temp);
			}
			for ( int i = 0; i < input.length; i++ )
	            input[i] = temp[i];
			System.out.println("The sorted array is : {}"+Arrays.toString(temp));
		}
		
	}
	
	public void merge(int[] input, int left, int mid , int right, int[] temp) {
		int i=left;
		int j=mid;
		int k=left;
		
		while(i<mid && j<right) {
			if(input[i]<input[j]) {
				temp[k++]=input[i++];
			}else {
				temp[k++]=input[j++];
			}
		}
		
		while(i<mid) {
			temp[k++]=input[i++];
		}
		
		while(j<right) {
			temp[k++]=input[j++];
		}
	}
	
	public static void main(String args[]) {
		int[] input = {6  , 3   ,7  , 2,   8,   4,  9,  1 };
		IterativeMergeSort sort = new IterativeMergeSort();
		System.out.println("The array before sorting is "+Arrays.toString(input));
		sort.sort(input);
		System.out.println("The array after sorting is "+Arrays.toString(input));

		
	}
	
}
