import java.io.*;
import java.util.Random;
import java.util.UUID;


public class example31_2 {

    private static String mainPathDir = "C:\\out\\%s";
    private static int UTF = 3;
    private static int DBL = 5;

    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        PrintWriter out = null;
        try {
            in = new DataInputStream(new FileInputStream(FileForTask(GetFileByName("2_INPUT.txt"))));
            out = new PrintWriter(GetFileByName("2_OUTPUT.txt"), "cp1251");
            for (int i = 0; i < UTF; i++) {
                String string = in.readUTF();
                if (i == 1) {
                    out.println(string);
                }
                System.out.println("Строка: " + i + 1 + ": " + string);
            }
            for (int i = 0; i < DBL; i++) {
                double dbl = in.readDouble();
                if (dbl > 0) {
                    out.println(dbl);
                }
                System.out.println("Число: " + i + 1 + ": " + dbl);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
            out.flush();
            out.close();
        }
    }

    public static File GetFileByName(String fileName) throws IOException {
        File f1 = new File(String.format(mainPathDir, fileName));
        f1.createNewFile();
        return f1;
    }

    public static File FileForTask(File file) throws IOException {
        DataOutputStream in = null;
        try {
            in = new DataOutputStream(new FileOutputStream(file));
            Random r = new Random();
            for (int i = 0; i < UTF; i++) {
                in.writeUTF(UUID.randomUUID().toString());
            }
            for (int i = 0; i < DBL; i++) {
                in.writeDouble(-1000 + 2000 * r.nextDouble());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return file;
    }
}
