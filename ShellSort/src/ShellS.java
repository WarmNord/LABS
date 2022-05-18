public class ShellS {

    public static int increment(int[] inc, int size) {
        int p1, p2, p3, s;
        p1 = p2 = p3 = 1;
        s = -1;
        do {
            if (++s % 2 == 0) {
                inc[s] = 8 * p1 - 6 * p2 + 1;
            } else {
                inc[s] = 9 * p1 - 9 * p3 + 1;
                p2 *= 2;
                p3 *= 2;
            }
            p1 *= 2;
        } while (3 * inc[s] < size);
        return s > 0 ? --s : 0;
    }

     static void shellSort(int a[], int size) {
        int inc, i, j;
        int seq[] = new int[40];
        int s;
// вычисление последовательности приращений
        s = increment(seq, size);
        while (s >= 0) {
// сортировка вставками с инкрементами inc[]
            inc = seq[s--];
            for (i = inc; i < size; i++) {
                int temp = a[i];
                for (j = i-inc; (j >= 0) && (a[j] > temp); j -= inc)
                    a[j+inc] = a[j];
                a[j+inc] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int test [] = new int[20];
        for (int i = 0; i < test.length; i++){
            test[i]= (int) Math.round(Math.random() * 100);
            System.out.print(test[i] + " ");
        }
        System.out.println();

        shellSort(test, test.length);

        for (int i:test
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        shellSort(test, test.length);

        for (int i:test
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        shellSort(test, test.length);

        for (int i:test
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        shellSort(test, test.length);

        for (int i:test
        ) {
            System.out.print(i + " ");
        }
    }


}
