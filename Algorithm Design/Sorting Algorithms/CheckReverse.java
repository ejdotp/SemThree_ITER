public class CheckReverse
{
	public static boolean checkReverse(int[] arr, int size)
	{
		int start = -1;
		int stop = -1;
		for(int i = 0; i<(size-1); i++)
		{
			if(arr[i]>arr[i+1])
			{
				start = i;
				break;
			}
		}
		
		if(start == -1)
			return true;
		
		for(int i = start; i<(size-1); i++)
		{
			if(arr[i]<arr[i+1])
			{
				stop = i;
				break;
			}
		}
		if(stop == -1)
			return true;
		
		if(arr[start-1] > arr[stop] || arr[stop+1] < arr[start])
			return false;
		
		for(int i = stop+1; i<size-1; i++)
		{
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int arr1[] = {1, 2, 6, 5, 4, 7};
		System.out.println(checkReverse(arr1, arr1.length));
	}
}
