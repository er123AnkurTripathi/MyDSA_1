package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] intArr=new int[] {2,34,3,33,56,25};
      applyBubbleSorting(intArr);
      for(int i=0;i<intArr.length;i++)
      {
    	  System.out.println(intArr[i]);
      }
	}

	public static void applyBubbleSorting(int[] intArray)
	{
		int sizeOfArray=intArray.length;
		int temp=0;
		for(int i=sizeOfArray-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				
				if(intArray[j]>intArray[j+1])
				{
					temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
			}
		}
		
	}
}
