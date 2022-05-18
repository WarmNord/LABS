import java.util.Scanner;

public class example31_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введиде текущий день недели: ");
        String weekday = input.nextLine();

        System.out.print("Введиде текущий месяц: ");
        String month = input.nextLine();

        System.out.print("Введиде текущее число месяца: ");
        int day = input.nextInt();

        System.out.println(weekday + " " + day + " " + month);
    }
}
