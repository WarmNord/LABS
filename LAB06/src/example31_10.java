public class example31_10 {

    static int [] minAndMax(int ... number) {
        int [] result = new int[2];
        int min = number[0];
        int max = number[0];

        for (int i = 1; i < number.length; i++){
            if (number[i] < min) {
                min = number[i];
            }
        }

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        int t[] = {12,400,0,10,-1,80};
        int res [] = example31_10.minAndMax(t);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
