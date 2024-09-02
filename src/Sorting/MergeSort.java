package Sorting;

import java.util.Arrays;
import java.util.List;

import ArrayUtilities.MyArrayUtil;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[] {5,4,3,2,1};
		int n=intArray.length-1;
		applyMergeSorting(intArray, 0, n);
		MyArrayUtil.printIntArrayElements(intArray);
	}

	public static void applyMergeSorting(int[] intArray, int startIndex, int endIndex)
	{
		if(endIndex>startIndex)
		{
		int mid=(startIndex+endIndex)/2;
		applyMergeSorting(intArray, startIndex, mid);
		applyMergeSorting(intArray, mid+1, endIndex);
		merge(intArray, startIndex, mid, endIndex);
		
		}
		
		
	}
	
	public static void merge(int[] intArray,  int startIndex,int mid, int endIndex)
	{
		intArray=MyArrayUtil.mergeTwoSortedArraysUsingTwoPointersApproach(Arrays.copyOfRange(intArray, startIndex, mid), Arrays.copyOfRange(intArray, mid+1, endIndex));
	}
	
	
}
