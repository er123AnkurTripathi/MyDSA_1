package ArrayUtilities;

public class MyArrayUtil {

	public static void printIntArrayElements(int[] intArr)
	{
		for(int i=0;i<intArr.length;i++)
	      {
	    	  System.out.println(intArr[i]);
	      }
	}
	
	public static int[] mergeTwoSortedArraysUsingTwoPointersApproach(int[] a, int[] b)
	{
		int mergedArrayLength=a.length+b.length;
		int[] mergedArray=new int[mergedArrayLength];
		int i=0,j=0;
		for(int k=0;k<mergedArrayLength; k++)
		{
			if(i<a.length && j<b.length)
			{
				
			if(a[i]<b[j])
			{
				mergedArray[k]=a[i];
				i++;
				
			}
			else
			{
				mergedArray[k]=b[j];
				j++;
			}
			}
		}
		return mergedArray;
	}
}
