import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(1, Factorial.factoriel(0));
        Assert.assertEquals(1, Factorial.factoriel(1));
        Assert.assertEquals(120, Factorial.factoriel(5));

    }
    
    
    // TODO
}
