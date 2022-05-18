public class example31_05 {
    private int number;

    public example31_05(int number) {
        if (number > 100) {
            this.number = 100;
        } else this.number = number;
    }

    public example31_05() {
        this.number = 0;
    }

    public void setNumber(int number) {
        if (number > 100) {
            this.number = 100;
        } else this.number = number;
    }

    public void setNumber() {
        this.number = 0;
    }

    public void checkNumber() {
        System.out.println(number);
    }

}
