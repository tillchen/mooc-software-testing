package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }

    @Test
    public void addFiveTo42() {
        int result = new GettingStarted().addFive(42);
        Assertions.assertEquals(47, result);
    }

    @Test
    public void addFiveTo5() {
        int result = new GettingStarted().addFive(5);
        Assertions.assertEquals(10, result);
    }
}
