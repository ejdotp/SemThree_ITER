public class Q4Besi
{

    public static long reverseBits(long n) 
    {
        long reversedWord = 0;

        for (int i = 0; i < 64; i++) 
        {
            long bit = (n >> i) & 1;
            reversedWord |= (bit << (63 - i));
        }

        return reversedWord;
    }

    public static void main(String[] args) 
    {
        long inputWord = 0b1010101010101010L;

        System.out.println("Original word: " + Long.toBinaryString(inputWord));
        long result = reverseBits(inputWord);
        System.out.println("Reversed word: " + Long.toBinaryString(result));
    }
}