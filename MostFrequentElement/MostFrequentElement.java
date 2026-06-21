Scanner scanner = new Scanner(System.in);

System.out.println("Enter the array size:");
int size = scanner.nextInt();

int[] numbers = new int[size];

int maxCount = 0;
int mostFrequentNumber = 0;
int count = 0;

for (int i = 0; i < numbers.length; i++) {

    System.out.println("Enter a number:");
    int currentNumber = scanner.nextInt();

    numbers[i] = currentNumber;

    count = 0;

    for (int j = 0; j < numbers.length; j++) {

        if (numbers[j] == numbers[i]) {
            count++;
        }

        if (count > maxCount) {
            maxCount = count;
            mostFrequentNumber = numbers[i];
        }
    }
}

System.out.println(mostFrequentNumber);

scanner.close();
