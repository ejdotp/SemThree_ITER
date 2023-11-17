//TO FIND SUM OF AN ARRAY OF N ELEMNTS RECURSIVELY

public class Sum_of_N
{
	public static int calcsum(int arr[], int i, int length)
	{
		if(i==length)
			return 0;
		return arr[i] + calcsum(arr, i+1, length);
	}

	public static void main(String[] args)
	{
		int[] arr = {2, 3, 4, 5, 1};
		int N = arr.length;
		int sum = calcsum(arr, 0, N);
		System.out.println("The sum of N-element array is: "+sum);
	}
}

/*Output:
The sum of N-element array is: 15
*/
