import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Print the number itself if it's not divisible by either of 3 or 5
        Assert.assertEquals("1", fizzBuzz.action(1));
        Assert.assertEquals("2", fizzBuzz.action(2));

        // Print "Fizz" if the number is a multiple of three
        Assert.assertEquals("Fizz", fizzBuzz.action(3));
        Assert.assertEquals("Fizz", fizzBuzz.action(9));

        // Print "Buzz" if the number is a multiple of five
        Assert.assertEquals("Buzz", fizzBuzz.action(10));
        Assert.assertEquals("Buzz", fizzBuzz.action(20));

        // Print "FizzBuzz" if it's a multiple of 3 and 5
        Assert.assertEquals("FizzBuzz", fizzBuzz.action(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.action(30));

    }
}
