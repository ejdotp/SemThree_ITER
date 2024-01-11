//The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise,it is 0.  Write a Java program to count the parity of an integer number.
public class Q2
{
    static String countParity(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;    // i,s binary is added with 1's binary
            n >>= 1;
        }
        if(count%2==0)
            return "Even Parity";
        else
            return "Odd Parity";
    }
    public static void main(String[] args)
    {
        int n = 17; //input
        System.out.println("The parity of the number "+n+" is: "+countParity(n));
    }
}
