import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.println("ادخل حجم المصفوفة");
        int size = k.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ادخل الرقم");
            numbers[i] = k.nextInt();
        }

        System.out.println("ادخل رقم للبحث عنه");
        int search = k.nextInt();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("الرقم موجود عند الفهرس: " + index);
        } else {
            System.out.println("الرقم غير موجود");
        }
    }
}
