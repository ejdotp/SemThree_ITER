import java.util.Scanner;

public class Q12
{
    public static int combine(int n1, int n2)
    {
        int onetwo = Math.abs(n1) / 100;
        int threefour = Math.abs(n2) % 100;
        int result = onetwo * 100 + threefour;
        if (n1 < 0)
            result = -result;
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second integer number: ");
        int n2 = sc.nextInt();

        int x = combine(n1, n2);

        System.out.println("Combined number: " + x);
    }
}
