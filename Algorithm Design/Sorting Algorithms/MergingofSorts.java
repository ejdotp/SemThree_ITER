//Merge two sorted array being sorted

public class MergingofSorts
{
	public static void fusion(int[] a, int s1, int[] b, int s2)
	{
		int index = 0;
		int temp;
		while(index<s1) {
			if(a[index]<=b[0]) {
				index+=1;
			} else {
				temp = a[index];
				a[index]=b[0];
				b[0]=temp;
				index+=1;
				for(int i=0; i<(s2-1); i++)
				{
					if(b[i]<b[i+1])
						break;
					temp = b[i];
					b[i] = b[i+1];
					b[i+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int a[] = {1, 5, 9, 10, 15, 20};
		int b[] = {2, 3, 8, 13};
		fusion(a, a.length, b, b.length);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
	}
}

/*Output:
1 2 3 5 8 9 
10 13 15 20 
*/