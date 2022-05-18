public class example31_04 {
    public static void main(String[] args) {
        String t [][] = new String[6][6];

        for (int i = 0; i < 6; i++) {
            String l = "+";
            for (int j = 0; j <= i; j++) {
                t[i][j] = l;
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }

    }
}
