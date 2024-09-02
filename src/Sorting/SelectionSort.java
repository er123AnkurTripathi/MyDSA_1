package Sorting;

import ArrayUtilities.MyArrayUtil;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] intArray=new int[] {5,4,10,6,1,8,0,9};
        applySelectionSort(intArray);
        MyArrayUtil.printIntArrayElements(intArray);
	}

	public static void applySelectionSort(int[] a)
	{
		int sortedArrayLastIndex=-1;
		int smallestIntInDexUnSortedArray=0;
		int n=a.length;
		int temp=0;
		int j=0;
		for(int i=0;i<n;i++)
		{
			smallestIntInDexUnSortedArray=i;
			for( j=i+1; j<n;j++)
			{   //Find Smallest Element in Current Array
				if(a[smallestIntInDexUnSortedArray]>a[j])
				{
					smallestIntInDexUnSortedArray=j;
				}
			}
			temp=a[sortedArrayLastIndex+1];
			a[sortedArrayLastIndex+1]=a[smallestIntInDexUnSortedArray];
			a[smallestIntInDexUnSortedArray]=temp;
			
			sortedArrayLastIndex++;
		}
	}
}
