
//412 easy
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzzLogic s = new FizzBuzzLogic();

        System.out.println(s.fizzBuzz(15));
    }
}

class FizzBuzzLogic {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}