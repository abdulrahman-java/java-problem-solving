import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
