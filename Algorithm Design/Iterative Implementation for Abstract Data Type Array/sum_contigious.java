//Finding the Largest Sum Contigious Number?

public class sum_contigious
{

	public static void main(String[] args)
	{
		int[] Arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < Arr.length; i++) {
            total += Arr[i];
            if (total > max) {
                max = total;
            }
            if (total < 0) {
                total = 0;
            }
        }

        System.out.println("The largest sum contiguous subarray is: " + max);

	}

}
