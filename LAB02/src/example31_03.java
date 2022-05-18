import java.util.Scanner;

public class example31_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int i = input.nextInt();

        if (i % 4 == 0 && i >= 10) {
            System.out.println("Введенное число удовлетворяет критериям");
        } else {
            System.out.println("Введенное число не удовлетворяет критериям");
        }
    }
}
