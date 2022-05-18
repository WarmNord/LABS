import java.util.Scanner;

public class example31_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = scan.nextLine();
        String originalText = text;
        int key;

        System.out.print("Введите ключ: ");
        key = scan.nextInt();

        char[] ArrayChar = text.toCharArray(); // преобразуем переданную в метод строку в символьный массив
        long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
        char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
        //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + key; // прибавляем к символу с индексом i сдвиг
            ArrayCharNew[i] = (char) ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
        }
        text = new String(ArrayCharNew); // преобразовываем новый массив символов в строку

        System.out.print("Текст после преобразования : ");
        for (char c : text.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();
        boolean cycle = true;
        System.out.println("Выполнить обратное преобразование? (y/n): ");

        while (cycle) {
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();
            switch (answer) {
                case "y":
                    System.out.print("Текст до преобразования: ");
                    key = -key;
                    for (int i = 0; i < ArrayCharNew.length; i++) {
                        ArrayCharNew[i] += key;
                    }
                    for (char c : originalText.toCharArray()) {
                        System.out.print(c);
                    }
                    cycle = false;
                    break;
                case "n":
                    System.out.println("До свидания !");
                    cycle = false;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
                    break;
            }


        }

    }
}
