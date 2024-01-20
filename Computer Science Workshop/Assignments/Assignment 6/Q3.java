public class Q3
{

    public static int swapBits(int n, int i, int j) 
    {
        int bit_i = (n >> i) & 1;
        int bit_j = (n >> j) & 1;

        if(bit_i != bit_j)
        {
            n=n^(1<<i);
            n=n^(1<<j);
        }

        return n;
    }

    public static void main(String[] args)
    {
        int n = 23;
        int i = 2;      
        int j = 4;      
        System.out.println("Original number: " + Integer.toBinaryString(n));
        int result = swapBits(n, i, j);
        System.out.println("Number after swapping bits: " + Integer.toBinaryString(result));
    }
}
