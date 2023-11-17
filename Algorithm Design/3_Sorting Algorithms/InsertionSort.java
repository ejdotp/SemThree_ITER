class InsertionSort
{
	public void insort(int[] a)
	{
		int size = a.length, temp, j;
		for(int i = 1; i< size; i++)
		{
			temp = a[i];
			for(j = i; j>0 && a[j-1]>temp; j--)
			{
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	public static void main(String[] args)
	{
		int[] a = {0, 1, 8, 2, 7, 3, 6, 4, 5};
		InsertionSort I = new InsertionSort();
		I.insort(a);
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}
}
