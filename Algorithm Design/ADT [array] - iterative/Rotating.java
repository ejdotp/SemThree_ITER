//roating array at the nth position

public class Rotating
{

	public static void print(int arr[])
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] Arr = {5, 6, 7, 1, 2, 3, 4};
		int k = 3;
		print(Arr);
		for(int i=0; i<k+1; i++)
		{
			for(int j = Arr.length-1; j>0; j--)
			{
				int t = Arr[j];
				Arr[j] = Arr[j-1];
				Arr[j-1] = t;
			}
		}
		print(Arr);
		
	}

}

/*Output:
5 6 7 1 2 3 4 
1 2 3 4 5 6 7
*/
