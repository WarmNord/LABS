import java.util.Scanner;

public class example31_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");

        int num = input.nextInt();

        int arr[];

        if (num >= 0) {
            arr = new int[num];
            int size = 0;
            int n = 0;
            int index = 0;

            while (size != arr.length) {
                if (n % 5 == 2) {
                    arr[index] = n;
                    System.out.println(arr[index]);
                    index++;
                    size++;

                }
                n++;
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }


    }
}
