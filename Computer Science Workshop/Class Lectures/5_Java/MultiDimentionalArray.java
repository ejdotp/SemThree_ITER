public class MultiDimentionalArray
{
    public static void main(String[] args)
    {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(numbers[1][2]);
        int k = numbers[2][2];
        System.out.println(k);
        numbers[2][1] = 10;
        System.out.println(numbers[2][1]);
    }
}