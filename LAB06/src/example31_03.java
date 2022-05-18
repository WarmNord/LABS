public class example31_03 {

    static int max(int ... nubmer) {
        int m = nubmer[0];
        for (int i = 1; i < nubmer.length; i++) {
            if (nubmer[i] > m) {
                m = nubmer[i];
            }
        }
        return m;
    }

    static int min(int ... number) {
        int min = number[0];
        for (int i = 1; i < number.length; i++){
            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }

    static int middle(int ... number){
        int sum = 0;
        for (int i :
                number) {
            sum += i;
        }

        return sum / number.length;
    }

    public static void main(String[] args) {
        System.out.println(example31_03.max(1,8,3,5,7,3,8));
        System.out.println(example31_03.min(1,8,3,5,7,3));
        System.out.println(example31_03.middle(1,2,3,4,5));
    }
}
