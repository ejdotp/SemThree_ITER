//find the missing no. in an arrays
import java.util.Arrays;

public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return n;
    }
}