//58 easy
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(findLastWordLength("i am ragu"));
    }

    static int findLastWordLength(String sentence) {
        sentence = sentence.stripTrailing();
        int length = 0;
        for (int i = sentence.length() - 1; i >= 0; i--) {

            if (sentence.charAt(i) == ' ') {
                return length;
            }

            length++;
        }
        return length;
    }
}
