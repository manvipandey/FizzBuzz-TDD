import org.junit.Test;

public class FizzBuzz {

    public String action(int input) {

        if(input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        }

        else if(input % 3 == 0) {
            return "Fizz";
        }

        else if(input % 5 == 0) {
            return "Buzz";
        }

        else {
            return String.valueOf(input);

        }
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        // FizzBuzz for numbers from 1 to 100
        for(int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz.action(i));
        }

    }
}
