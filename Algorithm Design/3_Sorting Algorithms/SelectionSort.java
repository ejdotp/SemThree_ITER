class SelectionSort
{
	public void sort(int[] a)
	{
		int n = a.length;
		 int i, j, max, temp;
		for(i=0; i<n-1; i++)
		{
			max = 0;
			for(j = 1; j<n-i; j++)
			{
				if(a[j]>a[max])
				{
					max = j;
				}
			}
			temp = a[n-1-i];
			a[n-1-i] = a[max];
			a[max] = temp;	
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {0, 1, 8, 2, 7, 3, 6, 4};
		SelectionSort S = new SelectionSort();
		S.sort(a);
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}

}
