//to find sum of n natural numbers

import java.util.*;

public class Sum_of_Nnumbers
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;;
		System.out.println("Sum of n-numbers is: "+sum);
		sc.close();

	}

}
