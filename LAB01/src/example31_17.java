import java.util.Scanner;

public class example31_17 {
    public static void main(String[] args) {
        // Напишите программу, в которой Пользователь вводит два числа, а
        //программой вычисляется и отображается сумма и разность этих чисел.

        Scanner input = new Scanner(System.in);

        System.out.print("Введиде число: ");
        int i1 = input.nextInt();

        System.out.print("Введиде число: ");
        int i2 = input.nextInt();

        int sum = i1 + i2;
        int difference = i1 - i2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }
}
