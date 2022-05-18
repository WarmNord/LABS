public class example31_06 {
    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {

        int rows = 4;
        int columns = 5;
        int arr[][] = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * (300 + 1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int R = rnd(3);
        System.out.println("Row: " + (R + 1));
        int C = rnd(4);
        System.out.println("Coloumn: " + (C + 1));
        int p = 0;
        int newArr[][] = new int[rows - 1][columns - 1];

        for (int i = 0; i < rows; ++i) {
            if (i == R)
                continue;
            int q = 0;
            for (int j = 0; j < columns; ++j) {
                if (j == C)
                    continue;
                newArr[p][q] = arr[i][j];
                ++q;
            }
            ++p;
        }

        System.out.println();

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
