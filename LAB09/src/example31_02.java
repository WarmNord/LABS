import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class example31_02 {
}


class exercise01_NotMethods {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        String input;
        while (true)
        {
            input = sc.nextLine();
            array.add(Integer.parseInt(input));
            System.out.println(array.toString());
        }

       /* //for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > 0) {
                arr2.add(array.get(i));
            }
        }*/
    }

}

