public class FindUniqueElements {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 2, 7, 4, 9, 1};
        int[] unique = new int[numbers.length];
        int countUnique = 0;

        boolean isFound;

        for (int i = 0; i < numbers.length; i++) {
            isFound = false;

            for (int j = 0; j < countUnique; j++) {
                if (numbers[i] == unique[j]) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                unique[countUnique] = numbers[i];
                countUnique++;
            }
        }

        for (int i = 0; i < countUnique; i++) {
            System.out.println(unique[i]);
        }
    }
}
