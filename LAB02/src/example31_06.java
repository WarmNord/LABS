import java.util.Scanner;

public class example31_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int i = input.nextInt();

        if (i % 3 == 0) {
            System.out.println("Введенное число делится на 3");
        } else {
            System.out.println("Введенное число не делится на 3");
        }

    }
}
