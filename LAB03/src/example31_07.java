public class example31_07 {
    public static void main(String[] args) {
        char arr[] = new char[10];
        char s = 'a';
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = s;
            s += 2;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
