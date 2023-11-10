//Given a list of n numbers, find element which appears the max no. of time
public class MaxCardinality
{
    public static int maxcar(int[] arr, int n)
    {
        int maxcount = 0;
        int maxfreq = 0;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxfreq=arr[i];
            }
        }
        return maxfreq;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 32, 5, 35, 4, 5, 4, 2, 2, 3, 3, 5};
        int n = arr.length;
        System.out.println(maxcar(arr, n));
    }
}
