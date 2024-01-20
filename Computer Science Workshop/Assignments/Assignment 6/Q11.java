import java.util.Scanner;
public class Q11
{
    public static int countEven(int num) 
    {
        num = Math.abs(num);
        int count = 0;
        while (num > 0) 
        {
            int d = num % 10;
            if ((d & 1) == 0) 
            {
                count++;
            }
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        int count = countEven(num);
        System.out.println("Number of even digits: " + count);
    }
}
