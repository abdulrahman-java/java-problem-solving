public class CountDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 2};

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            boolean isCounted = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isCounted = true;
                    break;
                }
            }

            if (isCounted) continue;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println(numbers[i] + " تكرر " + count + " مرات");
        }
    }
}
