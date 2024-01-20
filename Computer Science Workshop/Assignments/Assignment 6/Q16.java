import java.util.Scanner;

public class Q16
{
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void printPrimesInRange(int start, int end)
    {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                System.out.print(i + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        printPrimesInRange(start, end);
    }
}
