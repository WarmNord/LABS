import java.util.Scanner;

public class example31_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int i1 = input.nextInt();
        System.out.println("Введите целое число: ");
        int i2 = input.nextInt();

        if (i1 > i2) {
            for (int i = i2; i <= i1; i++) {
                System.out.print(i + " ");
            }
        } else if (i2 > i1) {
            for (int i = i1; i <= i2; i++) {
                System.out.print(i + " ");
            }
        } else if (i1 == i2) {
            System.out.println(i1 + " " + i2);
        }

    }
}
