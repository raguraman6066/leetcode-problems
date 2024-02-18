
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123456789));
    }

    static int reverse(int num) {
        boolean sign = true;
        if (num < 0) {
            sign = false;
        }
        num = Math.abs(num);
        long rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        if (!sign) {
            return -1 * (int) rev;
        }
        return (int) rev;
    }
}
