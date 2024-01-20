public class Q4
{

    public static int reverseBits(int n) 
    {
        int rev = 0;

        for (int i = 0; i < 4; i++) 
        {
            rev = rev << 1;
            rev = rev | (n&1);
            n = n>>>1;
        }

        return rev;
    }

    public static void main(String[] args) 
    {
        int n = 5;
        int rev = reverseBits(n);
    }
}