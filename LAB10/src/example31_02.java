import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class example31_02 {
    public static void main(String[] args) {
        try {
            System.out.println(ReadBytesFromStream(new FileInputStream("C:\\out\\02.txt"))
                    + "\n\n\n");
            System.out.println(ReadBytesFromStream(new URL("http://google.com").openStream())
                    + "\n\n\n");
            System.out.println(ReadBytesFromStream(new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4}))
                    + "\n\n\n");

        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }
    }
    public static String ReadBytesFromStream(InputStream inS) throws IOException
    {
        String res = "";
        while(true)
        {
            int oneByte = inS.read();
            if(oneByte != -1)
            {
                res += (char)oneByte;
            }
            else
            {
                res += "\nend";
                break;
            }
        }
        return res;
    }
}
