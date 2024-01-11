import java.util.Scanner;

public class Q14 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        boolean result = isPrime(inputNumber);

        if (result) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }
    }
}
