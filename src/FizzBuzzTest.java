import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.action(1));
        Assert.assertEquals("2", fizzBuzz.action(2));

    }


}
