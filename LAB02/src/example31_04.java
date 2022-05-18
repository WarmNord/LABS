import java.util.Scanner;

public class example31_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int i = input.nextInt();

        if (i >= 5 && i <= 10) {
            System.out.println("Введенное число попадает в диапазон от 5 до 10 включительно");
        } else {
            System.out.println("Введенное число не попадает в диапазон от 5 до 10 включительно");
        }
    }
}
