//convert array to alternating maximum minimum array?

import java.util.Arrays;

public class Max_Min_Array
{
    public static void main(String[] args)
    {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = new int[arr.length];
        Arrays.sort(arr);int minIndex = 0;
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[maxIndex];
                maxIndex--;
            } else {
                result[i] = arr[minIndex];
                minIndex++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
