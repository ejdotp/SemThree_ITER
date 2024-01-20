import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        int n = 155566;

        n = Math.abs(n);

        int[] freq = new int[10];

        while (n > 0)
        {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i] + " times");
    }
}
