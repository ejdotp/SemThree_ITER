//Write a Java program to count the number of bits that are set to 1 in an integer.
import java.io.*;
public class Q1
{
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;    // i,s binary is added with 1's binary
            n >>= 1;
        }
        return count;
    }
 
    // driver program
    public static void main(String args[])
    {
        int i = 17; //input
        System.out.println(countSetBits(i));
    }
}