//to find the maximum and minimum element of an array:
public class Find_MaxMin
{

	public static int FindMin(int arr[], int n)
	{
		if(n == 1)
			return arr[0];
		
		return Math.min(arr[n-1], FindMin(arr, n-1));
	}
	
	public static int FindMax(int arr[], int n)
	{
		if(n == 1)
			return arr[0];
		
		return Math.max(arr[n-1], FindMin(arr, n-1));
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = arr.length;
		System.out.println("Max element is: "+FindMax(arr, n));
		System.out.println("Min element is: "+FindMin(arr, n));
	}

}

/*Output:
Max element is: 9
Min element is: 1
*/
