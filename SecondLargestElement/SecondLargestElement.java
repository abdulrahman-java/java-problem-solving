   int first=0;int k=0;

        int []m={3, 7, 2, 9, 5, 9, 1};
        for (int i=0;i<m.length;i++){
            if (m[i]>first) {
                first=m[i];
            }
        }
        for (int size=0;size<m.length;size++){
            if (m[size] > k && m[size]<first) {
                k=m[size];
            }
        }
            System.out.println(k);
