public class example31_05 {
    public static void main(String[] args) {
        int arr[][] = new int[5][2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                int n = (int) (Math.random() * (300 + 1));
                arr[i][j] = n;
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int newArr [][] = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
