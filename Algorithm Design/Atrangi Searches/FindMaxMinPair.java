//Given an array of integers, find the element pair with min/max difference
import java.util.*;
public class FindMaxMinPair
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 3, 7, 11, 9};
        int[] minpair = new int[2];
        int temp, diff=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                temp = arr[i] - arr[j];
                if(temp<0)
                    temp=(-temp);
                if(diff>temp)
                {
                    diff = temp;
                    minpair[0]=arr[i];
                    minpair[1]=arr[j];
                }
            }
        }
        System.out.println("Min pair is"+Arrays.toString(minpair));
        Arrays.sort(arr);
        System.out.println("Max pair is"+arr[0]+" "+arr[arr.length-1]);
    }
}
