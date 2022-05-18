public class example31_06 {
    static int[] fun(int[] arr, int n) {
        int newArr[];
        if (n > arr.length) {
            newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
        } else {
            newArr = new int[n];
            for (int i = 0; i < n; i++) {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int t[] = {1,2,3,4,5};
        int test[] = example31_06.fun(t, 7);
        for (int n :
                test) {
            System.out.println(n);
        }

    }
}