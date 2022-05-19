import java.util.Scanner;

public class example31_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите наименование дня недели: ");
        String day = input.nextLine();
        String day_lower = day.toLowerCase();
        System.out.println("Вложенные операторы");

        if (day_lower.equals("понедельник")) {
            System.out.println("1");
        } else if (day_lower.equals("вторник")) {
            System.out.println("2");
        } else if (day_lower.equals("среда")) {
            System.out.println("3");
        } else if (day_lower.equals("четверг")) {
            System.out.println("4");
        } else if (day_lower.equals("пятница")) {
            System.out.println("5");
        } else if (day_lower.equals("суббота")) {
            System.out.println("6");
        } else if (day_lower.equals("воскресенье")) {
            System.out.println("7");
        }

        System.out.println("Оператор Switch");
        switch (day_lower) {
            case "понедельник":
                System.out.println("1");
                break;

            case "вторник":
                System.out.println("2");
                break;

            case "среда":
                System.out.println("3");
                break;
            case "четверг":
                System.out.println("4");
                break;
            case "пятница":
                System.out.println("5");
                break;
            case "суббота":
                System.out.println("6");
                break;
            case "воскресенье":
                System.out.println("7");
                break;

            default:
                System.out.println("Введено некорректное значение");
        }


    }
}
