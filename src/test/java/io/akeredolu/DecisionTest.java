package io.akeredolu;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mikailaakeredolu on 6/11/16.
 */

    public class DecisionTest {
    @Test
    public void convertBelowHundred() throws Exception {
        Decision.convertBelowHundred(1);
        String actual = Decision.convertBelowHundred(1);;
        String expected = "One";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void convertaboveninetynineButBelowThousandTest() throws Exception {
        Decision.convertBelowHundred(159);
        String actual = Decision.convertBelowHundred(159);
        String expected = "OneHundredFiftyNine";
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void convertAbove100Below1000Test() throws Exception {
        Decision.convertAbove100Below1000(1099);
        String actual = Decision.convertAbove100Below1000(1099);
        String expected = "TenHundredNinetyNine";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void convertAbove1000butBelow1000000Test() throws Exception {
        Decision.convertAbove1000butBelow1000000(10999500);
        String actual = Decision.convertAbove1000butBelow1000000(10999500);
        String expected = "TenMillionNineHundredNinetyNineThousandFiveHundred";
        Assert.assertEquals(expected,actual);
    }

}