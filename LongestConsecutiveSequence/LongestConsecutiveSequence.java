int[] numbers = {1, 2, 2, 3, 4, 1};

int currentLength = 1;
int longestLength = 0;
int previous = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (previous + 1 == numbers[i]) {
        currentLength++;
    } else {
        currentLength = 1;
    }

    previous = numbers[i];

    if (currentLength > longestLength) {
        longestLength = currentLength;
    }
}

if (longestLength == 1) {
    longestLength = 0;
}

System.out.println(longestLength);
