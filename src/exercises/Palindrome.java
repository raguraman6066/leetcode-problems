package exercises;

// 9 easy
//end with 0 and negative num - not palindrome ..it should be reverse also same..0,1,2.. also palindrome
public class Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static boolean checkPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int reverse = 0;
        while (num > reverse) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return num == reverse / 10 || num == reverse;
    }
}
