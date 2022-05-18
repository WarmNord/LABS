import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class example31_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;
        int i = 0;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(GetFileByName("03_INPUT.txt")), "cp1251"));
            out = new PrintWriter(GetFileByName("03_OUTPUT.txt"), "cp1251");
            String line;
            while ((line = in.readLine()) != null) {
                i++;
                for (String string : GetWords(line/*.replaceAll(",|.", "")*/)) {
                    System.out.println(i + ": " + string);
                    out.println(i + ": " + string);
                }
                line = in.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            in.close();
            out.flush();
            out.close();
        }
    }

    private static String DirPath = "C:\\out\\";

    public static File GetFileByName(String filename) throws IOException {
        File f1 = new File(String.format(DirPath, filename));
        return f1;
    }

    private static ArrayList<String> GetWords(String inStr) {
        ArrayList<String> res = new ArrayList<String>();
        for (String string : inStr.split(" ")) {
            if (StartsWithСonsonant(string)) {
                res.add(string);
            }
        }
        return res;
    }

    private static String ConsonantList = "бвгджзйклмнпрстфхцчшщ";

    private static boolean StartsWithСonsonant(String inStr) {
        return ConsonantList.contains(inStr.subSequence(0, 1));
    }
}
