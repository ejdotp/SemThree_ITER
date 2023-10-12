class NthPower
{
    public static int pow(int n, int p)
    {
        if(p==0)
            return 1;
        else
            return n*pow(n, p-1);
    }
    public static void main(String[] args)
    {
        int n = 2, p = 5;
        System.out.println(pow(n, p));
    }
}

/*
Output:
    32
 */
