import java.util.Scanner;

public class example31_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите целое число в диапазоне от 1 до 7: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;

            case 2:
                System.out.println("Вторник");
                break;

            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Введено некорректное значение");
        }


    }
}
