import java.util.Scanner;

public class example31_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = input.nextInt();
        int sum = 0;

        System.out.println("Цикл for:");
        for (int i = 0; i <= num; i++) {
            if (i % 5 == 2 || i % 3 == 1) sum += i;
        }
        System.out.println(sum);

        int nWhile = 0;
        sum = 0;
        System.out.println("Цикл while:");
        while (nWhile != num + 1) {
            if (nWhile % 5 == 2 || nWhile % 3 == 1) sum += nWhile;
            nWhile++;
        }
        System.out.println(sum);


    }
}
