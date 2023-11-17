//Binary Search with Recursion

import java.util.*;
public class BinaryRecursiveSearch
{
	public static boolean bsearch(int[] a, int k, int s, int e)
	{
		if(s<=e)
		{
			int mid = s+(e-s)/2;
	    	if(k == a[mid])
	    		return true;
	    	if(k < a[mid])
	    		return bsearch(a, k, s, e=mid-1);
	    	if(k > a[mid])
	    		return bsearch(a, k, s=mid+1, e);
		}
    	return false;
	}
	public static void main(String [] args)
	{
		int arr[] = {1, 5, 6, 9, 10};
		int n = arr.length;
		Arrays.sort(arr);
	    int key = 16;
	    System.out.println("Element found in the array: "+bsearch(arr, key, 0, n-1));
	}
}

/*
Output:
Element found in the array: false
*/
