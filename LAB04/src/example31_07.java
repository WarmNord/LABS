public class example31_07 {
    public static void main(String[] args) {

        int arr[][]= new int[5][5];

        for (int i = 0; i < 5;i++) {
            arr[0][i] = 1;
        }

        for (int i = 4; i > 0; i--) {
            arr[i][4] = 2;
        }

        for (int i = 0; i < 4; i++) {
            arr[1][i] = 3;
        }

        for (int i = 4; i > 1; i--) {
            arr[i][3] = 4;
        }

        for (int i = 0; i < 3; i++) {
            arr[2][i] = 5;
        }

        for (int i = 4; i > 2; i--) {
            arr[i][2] = 6;
        }

        for (int i = 0; i < 2; i++) {
            arr[3][i] = 7;
        }
        int s = 8;
        for (int i = 1; i >= 0; i--) {
            arr[4][i] = s;
            s++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
