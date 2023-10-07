// to find factorial recursively
public class Factorial
{
	public static int facx(int n)
	{
		if(n==0 || n==1)
			return 1;
		
		return n*facx(n-1);
	}

	public static void main(String[] args)
	{
		int n = 7;
		System.out.println("Factorial of n is: "+facx(n));
	}

}

/*Output:
 Factorial of n is: 5040
 */
