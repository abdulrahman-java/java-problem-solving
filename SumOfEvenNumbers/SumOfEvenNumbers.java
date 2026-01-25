import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int first = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= first; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}

