public class example31_03 {
    public static void main(String[] args) {
        int f[][] = new int[3][7];
        int i, j = 0;


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 7; j++) {
                f[i][j] = 2;
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
    }
}
