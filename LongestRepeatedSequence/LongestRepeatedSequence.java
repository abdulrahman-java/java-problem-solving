int[] numbers = {1, 2, 2, 3, 3, 3, 2, 2, 1};

int count = 1;
int max = 1;
int prev = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (prev == numbers[i]) {
        count++;

        if (count > max) {
            max = count;
        }
    } else {
        count = 1;
    }

    prev = numbers[i];
}

System.out.println(max);
