import java.util.Scanner;

public class example31_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Введиде название месяца: ");
        String month = input.nextLine();

        System.out.print("Введиде количество дней в месяце: ");
        int day = input.nextInt();

        switch (month.toLowerCase()) {
            case "январь":

            case "март":

            case "май":

            case "июль":

            case "август":

            case "октябрь":

            case "декабрь":
                if (day <= 31 && day >= 1) {
                    System.out.println(month + " содержит указанное количество дней");
                } else {
                    System.out.println(month + " не содержит указанное количество дней");
                }
                break;

            case "февраль":
                if (day <= 29 && day >= 1) {
                    System.out.println(month + " содержит указанное количество дней");
                } else {
                    System.out.println(month + " не содержит указанное количество дней");
                }
                break;

            case "апрель":

            case "июнь":

            case "сентябрь":

            case "ноябрь":
                if (day <= 30 && day >= 1) {
                    System.out.println(month + " содержит указанное количество дней");
                } else {
                    System.out.println(month + " не содержит указанное количество дней");
                }
                break;

            default:
                System.out.println("Месяц введен неверно");

        }

    }
}
