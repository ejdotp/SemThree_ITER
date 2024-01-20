public class Q7 {

    public static long power(int x, int y) 
    {
        long result = 1;

        while (y > 0) 
        {
            if ((y & 1) == 1) 
                result *= x;
            
            x = x << 1;
            y = y >>> 1;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int base = 2;   // Base (x)
        int exponent = 3; // Exponent (y)
        long result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
