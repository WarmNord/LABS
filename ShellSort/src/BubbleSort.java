public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    isSorted = false;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i]; // текущий элемент массива тот что впереди
            int j = i - 1; // предыдущий элемент массива
            while (j >= 0 && current < array[j]) { // предыдущий элемент >= 0 AND текущий элемент < предыдущий элемент массива
                array[j + 1] = array[j]; // предыдущий элемент массива + 1(текущий) = предыдущий элемент массива
                j--; // декремент предыдущего элемента
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j + 1] = current; //
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 4, 1};
        insertionSort(arr);
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}
