import java.util.Scanner;

public class example31_20 {

    public static int Pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = input.nextInt();

        System.out.print("Введите степень: ");
        int b = input.nextInt();

        System.out.println("Результат: " + Pow(a, b));

    }
}
