public class CountOccurrences {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 2, 7, 2, 9};
        int target = 2;

        int count = 0;
        String positions = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
                positions += i + " ";
            }
        }

        if (count > 0) {
            System.out.println("Count: " + count);
            System.out.println("Positions: " + positions);
        } else {
            System.out.println("Not found");
        }
    }
}
