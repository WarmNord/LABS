public class ShellSort {
    public static int[] shell(int[] array) {
        int lengthArray = array.length; // Вычисление длины массива
        int step = array.length / 2; // Вычисление шага для сравнения элементов массива
        while (step > 0) {
            for (int i = 0; i < lengthArray - step; i++) {
                int j = i; // индекс массива
                while (j >= 0 && array[j] > array[j + step]) { // j>=0 && первый элемент пары > второй элемент расположенный на расстоянии шага
                    int temp = array[j]; // переменная для обмена значений; первый элемент пары
                    array[j] = array[j + step]; // второй элемент пары двигается вправо
                    array[j + step] = temp; // второй элемент пары двигается влево
                    j--; // декремент индекса
                }
                // выход из цикла значит j == -int && первый элемент пары < второго элемента пары
            }
            step = step / 2; // уменьшение шага для сравнения
        }
        return array;

    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        shell(arr);

        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
    }
}
