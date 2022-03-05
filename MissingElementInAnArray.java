package week3.day1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) 
	{
				int[] arr = {1,2,3,4,7,6,8};

				Arrays.parallelSort(arr);
	int length=arr.length;
for(int i=1;i<=length;i++)
{
					// check if the iterator variable is not equal to the array values respectively
					if(i!=arr[i-1])
					{
						System.out.println(i);
						break;
					}
					
						// print the number
						
						// once printed break the iteration

	}

}


}