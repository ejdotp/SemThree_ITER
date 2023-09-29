//Find the smallest smallest missing positive number?

public class Small_Missing
{
    public static void main(String[] args)
    {
        
        int missing = 1;
        int[] nums = {3, 4, -1, 1};
        for (int num : nums)
        {
            if (num > 0 && num <= missing)
            {
                missing++;
            }
        }
        System.out.println(missing); 
    }

}
