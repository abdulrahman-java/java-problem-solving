public class SumAndAverage {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 2, 4};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
