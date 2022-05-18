import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class example31_06 {
    public static void main(String[] args) {
        try {
            File folder = new File("C:\\My");
            if (!folder.exists())
                folder.mkdir();
            //Создание папки «My»на диске,
            //если она не существует
            File f1 = new File("C:\\My\\num1Mart.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            //Создание файла в папке
            System.out.print("Сколько чисел надо записать в файл? \n => ");
            int count = sc.nextInt(); // ввести количество чисел
            // Открыть файл одновременно для чтения и записи "rw"
            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            System.out.println("Исходный размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++) {
                rf.writeInt(sc.nextInt()); // Записать числа в файл. На каждое
            } // число типа int приходится 4 байта
            System.out.println("Новый размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Количество байт на 1 число = " + rf.length() / count);
            rf.close();
            // Открыть файл только для чтения "r"
            rf = new RandomAccessFile(f1, "r");
            // Прочитать числа из файла и вывести на экран
            System.out.println("\n Числа в файле:");
            for (int i = 0; i < count; i++) { // i – текущий номер числа
                rf.seek(i * 4); // перевод указателя на текущее число  i* 4 байта
                // в данной ситуации при последовательном считывании
                //операцию seek() можно было не использовать
                System.out.println("Число" + i + ": " + rf.readInt());
            }
            System.out.println("Числа в обратном порядке:");
            for (int i = count - 1; i >= 0; i--) {
                rf.seek(i * 4); // операцию использовать обязательно!
                System.out.println("Число" + i + ": " + rf.readInt());
            }
            rf.seek(rf.getFilePointer() - 4); // перевод указателя на последнее число
            System.out.println(" Количество чисел в файле= " + rf.length() / 4
                    + ", последнее число= " + rf.readInt());
            // Поиск заданного числа в файле и определение его номера (номеров)
            System.out.print("\nВведите число, которое нужно найти в файле => ");
            int x = sc.nextInt();
            int kol = 0; // количество искомых чисел в файле
            for (int i = 0; i < count; i++) {
                rf.seek(i * 4);
                int number = rf.readInt();
                if (number == x) {
                    kol++;
                    System.out.print("номер " + i + ", " );
                }
            }
            System.out.println(" количество искомых чисел = " + kol);
            rf.close();


            // СОРТИРОВКА ЧИСЕЛ В ФАЙЛЕ МЕТОДОМ «ПУЗЫРЬКА»



        } catch (IOException e) {
            System.out.println("End of file " + e);
        }

    }
}
