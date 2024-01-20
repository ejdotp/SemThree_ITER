public class Q17
{
    public static boolean isEven(int n)
    {
        return (n & 1) == 0;
    }

    public static void main(String[] args)
    {
        int n1 = 8;
        int n2 = 15;

        System.out.println(n1 + " is even: " + isEven(n1));
        System.out.println(n2 + " is even: " + isEven(n2));
    }
}
