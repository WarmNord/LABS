public class example31_07 {
    static int[] transformation(char[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (int) arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        char test[] = {'a', 'b', 'c'};
        int result[] = example31_07.transformation(test);
        for (int i:result
             ) {
            System.out.println(i);
        }
    }
}
