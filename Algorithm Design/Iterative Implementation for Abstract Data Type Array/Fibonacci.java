import java.util.*;

public class Fibonacci
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nth number: ");
		int f=0, s=1,t=0, n=sc.nextInt();
		System.out.println("Answer is: ");
		if(n==0)
			System.out.println(f);
		else if(n==1)
			System.out.println(s);
		else {
			for(int i=2; i<=n; i++)
			{
				t=f+s;
				f=s;
				s=t;
			}
			System.out.println(t);
		}
		
		sc.close();

	}

}
