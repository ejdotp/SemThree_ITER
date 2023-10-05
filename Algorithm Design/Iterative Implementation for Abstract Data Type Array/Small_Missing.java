//Find the smallest smallest missing positive number
import java.util.*;
public class Small_Missing
{
    public static void main(String[] args)
    {
        
        int[] nums = {3, 4, -1, 1};
        boolean flag = false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0 && (nums[i]+1 != nums[i+1]))
            {
                flag = true;
                System.out.println(nums[i]+1);
                break;
            }
        }
        
        /*method 2
        int missing = 1;
        for (int num : nums)
        {
            if (num > 0 && num <= missing)
            {
                missing++;
            }
        }
        System.out.println(missing); */
    }

}

/*Output:
2
*/
