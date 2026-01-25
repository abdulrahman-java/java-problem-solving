import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the missing number
        for (int number = 1; number <= size + 1; number++) {
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number is: " + number);
                break;
            }
        }

        scanner.close();
    }
}

