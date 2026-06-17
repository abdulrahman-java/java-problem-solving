   Scanner k = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int size = k.nextInt();

        boolean first = false;
        boolean notAscending = false;
        int prev = 0;

        for (int i = 0; i < size; i++) {

            System.out.println("Enter a number:");
            int n = k.nextInt();

            if (!first) {
                prev = n;
                first = true;
            }
            else if (n >= prev) {
                prev = n;
            }
            else {
                notAscending = true;
            }
        }

        k.close();

        if (notAscending) {
            System.out.println("Not Ascending");
        } else {
            System.out.println("Ascending");
        }
