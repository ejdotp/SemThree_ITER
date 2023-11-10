//Given an array of integers, find the element pair with min/max difference
import java.util.*;
public class FindMaxMinPair
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 3, 7, 11, 9};
        Arrays.sort(arr);
        int[] minpair = new int[2];
        int[] maxpair = new int[2];
        int temp, diff=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                temp = arr[j] - arr[i];
                if(diff>temp)
                {
                    diff = temp;
                    minpair[0]=arr[i];
                    minpair[1]=arr[j];
                }
            }
        }
        System.out.println("Min pair is"+Arrays.toString(minpair));
        maxpair[0] = arr[0];
        maxpair[1] = arr[arr.length-1];
        System.out.println("Max pair is"+Arrays.toString(maxpair));
    }
}
