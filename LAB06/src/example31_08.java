public class example31_08 {
    static int middle(int arr []){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int t [] = {1,2,4,5};
        System.out.println(example31_08.middle(t));
    }
}
