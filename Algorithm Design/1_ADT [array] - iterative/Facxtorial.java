//Finding factorial of n

import java.util.*;

public class Facxtorial
{

	public static void main(String[] args)
	{
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number to find it's factorial: ");
		int n = sc.nextInt();
		int prod = 1;
		for(int i = 1; i<=n; i++)
			prod*=i;
		System.out.println("Factorial is: "+prod);
		sc.close();

	}

}

/*Output:
Enter the number to find it's factorial: 12 
Factorial is: 479001600
*/
