//Given an array A of integers, write an efficient JAVA program to find the peak elements in the array, if present. A peak element is an element in the array that is not smaller than its neighbours (both left and right) and for the first and the last elements, only one neighbor is considered. Example: If the array A = {5, 10, 20, 15}, the peak element is 20. If the A = {30, 20, 15, 12, 25, 90, 66}, the peak elements are 30 and 90.
class Ailla
{
    public static void main(String[] args)
    {
        int[] arr = {30, 20, 15, 12, 25, 90, 66};
        int n = arr.length;
        if (n>=1 && arr[0] > arr[1])
                System.out.println(arr[0] + " ");
        for (int i = 1; i < n-1; i++)
        {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1])
                System.out.print(arr[i] + " ");
        }
        if (n>=2 && arr[n-1] > arr[n-2])
            System.out.print(arr[n-1]);
    }
}