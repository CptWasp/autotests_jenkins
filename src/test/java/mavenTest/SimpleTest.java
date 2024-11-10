package mavenTest;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test1(){
        System.out.println("начало теста");
        int a = 1;
        int b = 2;


        Assert.assertEquals(3, a + b);
    }

}
