import org.junit.Test;

public class FizzBuzz {

    public String action(int input) {

        if(input % 3 == 0) {
            return "Fizz";
        }
        else {
            return String.valueOf(input);
        }
    }

}
