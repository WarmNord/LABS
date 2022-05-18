import java.util.Scanner;

public class example31_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде число: ");
        int i1 = input.nextInt();

        System.out.print("Введиде число: ");
        int i2 = input.nextInt();

        int sum = i1 + i2;

        System.out.println("Сумма: " + sum);
    }
}
