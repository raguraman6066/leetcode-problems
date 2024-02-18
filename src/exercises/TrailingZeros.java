package exercises;

//172 medium
class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeros(0));
    }

    static int trailingZeros(int num) {
        if (num < 5) {
            return 0;
        }
        int sum = 0;
        while (num > 5) {
            sum = sum + num / 5;
            num = num / 5;
        }
        return sum;
    }
}

/*
 * 100/5=20 20/5=4 20+4=24
 */