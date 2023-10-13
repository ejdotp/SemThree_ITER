public class BubbleSort
{
	public void bubble(int[] A)
	{
		int n=A.length, temp;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(A[j] > A[j+1])
				{
					temp = A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {2, 3, 5, 7, 1, 8};
		BubbleSort b = new BubbleSort();
		b.bubble(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"");
		}

	}

}
