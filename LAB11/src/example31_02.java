import java.io.*;

public class example31_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out=null;
        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader( new FileReader("C:\\out\\MyFile_In.txt" ), 1024);
            out = new BufferedWriter( new FileWriter( "C:\\out\\02.txt" ));
            int lineCount = 0; // счетчик строк
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}
