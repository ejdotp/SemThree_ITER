//Binary Search without Recursion

import java.util.*;

public class BinaryIterativeSearch
{
	public static void main(String[] args)
	{
		int arr[] = {1, 5, 6, 9, 10};
		Arrays.sort(arr);
        boolean fish=false;
        int mid, key = 5, s=0, n=arr.length, e=(n-1);

        while(s <= e)
        {
        	mid = s+(e-s)/2;
        	if(key == arr[mid])
        	{
        		fish = true;
        		break;
        	}
        	if(key < arr[mid])
        		e=mid-1;
        	if(key > arr[mid])
        		s=mid+1;
        }
        
        System.out.println("Element found in the array: "+fish);
	}

}

/*
Output:
Element found in the array: true
*/