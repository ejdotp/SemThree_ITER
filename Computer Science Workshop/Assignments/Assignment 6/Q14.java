import java.util.Scanner;

public class Q14
{
    public static boolean isPrime(int n)
    {
        if (n < 2) 
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        boolean result = isPrime(n);

        if (result)
            System.out.println(n + " is a prime n.");
        else
            System.out.println(n + " is not a prime n.");
    }
}
