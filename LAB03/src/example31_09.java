public class example31_09 {
    public static void main(String[] args) {

        int arr[] = new int[25];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (300 + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int index = 0;
        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
                index = i;
            }
        }

        System.out.println();
        System.out.println("Минимальное значение Элемента: " + minNum);

        for (int i = 0; i < arr.length; i++) {

            if (minNum == arr[i]) {
                System.out.println("Индекс: " + i);
            }
        }


    }
}
