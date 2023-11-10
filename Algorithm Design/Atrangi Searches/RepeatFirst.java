//Finding first repeated element in an array
public class RepeatFirst {

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
		// TODO Auto-generated method stub

	}

}
