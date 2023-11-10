//Finding first repeated element in an array
public class RepeatFirst
{
	public static int Repeat(int[] a)
	{
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[j]==a[i])
					return a[i];
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 5, 3, 3, 5, 7, 9};
		System.out.println("First repeated element is: "+Repeat(arr));
	}
}
                                 
/*Output:
 First repeated element is: 5
 */