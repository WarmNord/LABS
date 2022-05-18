public class example31_09 {
    static void sort(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char t[] = {'a','b','c','d','f'};
        for (char i :
                t) {
            System.out.print(i + " ");
        }

        System.out.println();
        example31_09.sort(t);

        for (char i :
                t) {
            System.out.print(i + " ");
        }
    }
}
