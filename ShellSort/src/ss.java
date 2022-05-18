public class ss {
    public static int[] shellSort(int[] array) {
        int lengthArray = array.length; // длина массива
        int step = lengthArray / 2; //шаг для сравнения элементов

        while (step >= 1) {
            for (int i = step; i < lengthArray; i++) {
                int current = array[i]; // текущий элемент
                int j = i;

                while (j > 0 && array[j - step] > current) { //сравнение предыдущего(на расстоянии) и текущего элементов
                    array[j] = array[j - step]; // предыдущий > текущего -> текущий элемент становится предыдущим
                    j -= step; //уменьшение шага
                }
                array[j] = current; // текущий становится предыдущим
            }
            step = step / 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] example = ss.shellSort(new int[]{5, 2, 0, 4, 1});
        for (int i : example) {
            System.out.println(i);
        }
    }
}
