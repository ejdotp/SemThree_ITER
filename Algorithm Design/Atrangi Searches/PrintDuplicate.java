//Print all the duplicates in a list
public class PrintDuplicate
{
    public static void Duplicate(int[] a)
	{
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[j]==a[i])
					System.out.print(a[j]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 5, 3, 3, 3, 5, 7, 9};
        PrintDuplicate dp = new PrintDuplicate();
		System.out.println("Duplicate elements are: ");
        dp.Duplicate(arr);
	}
}
