//find nth fibonacci recursively:
	
public class Fibonacci
{

	public static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
		int n = 9;
		System.out.println("Nth Fibonacci number is: "+fib(n));

	}

}

/*Output:
 Nth Fibonacci number is: 34
 */