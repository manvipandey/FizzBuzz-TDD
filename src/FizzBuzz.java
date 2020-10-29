import org.junit.Test;

public class FizzBuzz {

    public String action(int input) {

        if(input % 3 == 0) {
            return "Fizz";
        }
        else if(input % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(input);
        }
    }

}
