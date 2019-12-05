import org.junit.Assert;
import org.junit.Test;

public class CountLettersTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        Assert.assertEquals(2, CountLetters.countLetters("lsdhflzhf", 'l'));
    }
    
    @Test
    public void test2() throws Exception {
        Assert.assertEquals(-1, CountLetters.countLetters("", 'l'));
    }
}
