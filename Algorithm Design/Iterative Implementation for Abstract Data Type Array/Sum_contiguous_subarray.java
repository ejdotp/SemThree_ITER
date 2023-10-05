// Java program to print largest contiguous subarray
class Sum_contiguous_subarray
{
    public static void main(String[] args)
    {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        int sum = 0, max = 0, start = 0, end = 0, s = 0;
 
        for (int i = 0; i < n; i++) {
            max += a[i];
 
            if (sum < max) {
                sum = max;
                start = s;
                end = i;
            }
 
            if (max < 0) {
                max = 0;
                s = i + 1;
            }
        }

        System.out.print("Largest Contiguous Subarray: [ ");
        for(int i=start; i<=end; i++)
			System.out.print(a[i]+" ");
        System.out.println("]");

        System.out.println("Maximum contiguous sum is "+ sum);
        
    }
}

/*
Output:
Largest Contiguous Subarray: [ 4 -1 -2 1 5 ]
Maximum contiguous sum is 7
*/
