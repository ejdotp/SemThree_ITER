class SmallMissing
{
    public static int miss(int[] arr, int n)
    {
        if(n<=0)
            return 1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == n)
                return miss(arr, n+1);
        }
        return n;
    }
    public static void main(String[] args)
    {
        int[] arr={1, -2, 2, 3, -1, 5};
        System.out.println("Smallest missing +ve number is: "+miss(arr, 1));
    }
}

/*
Output:
    Smallest missing +ve number is:  4
 */