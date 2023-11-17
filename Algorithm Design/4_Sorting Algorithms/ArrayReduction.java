//Find min element and subtract it from all elements. print how many elements left in each reduction and number of reductions.

import java.util.*;
public class ArrayReduction
{ 
	public static int obliterate(int[] a, int x)
	{
		int count=0;
		int count2=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<=0)
				count2++;
		}
		if(count2==a.length)
			return x;
		int t=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>0)
			{
				t=a[i];
				break;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			a[i]=(a[i]-t);
			if(a[i]>0)
				count++;
		}
		System.out.println("No. of elements left:"+(count));
		return obliterate(a, x+1);
	}
	public static void main(String[] args)
	{
		int[] a= {5, 1, 1, 1, 2, 3, 5};
		Arrays.sort(a);
		int x=obliterate(a, 0);
		System.out.println("No. of reductions: "+x);
	}
}
/*Output:
No. of elements left:4
No. of elements left:3
No. of elements left:2
No. of elements left:0
No. of reductions: 4
*/
