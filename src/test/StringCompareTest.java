import org.junit.Assert;
import org.junit.Test;

public class StringCompareTest {


    @Test
    public void test1() throws Exception {
        Assert.assertEquals(3, StringCompare.countChar("adcd", "abcd"));
    }
    @Test
    public void test2() throws Exception {
        Assert.assertEquals(-1, StringCompare.countChar(null, "abcd"));
    }
    @Test
    public void test3() throws Exception {
        Assert.assertEquals(-1, StringCompare.countChar("abcd", null));
    }
    @Test
    public void test4() throws Exception {
        Assert.assertEquals(0, StringCompare.countChar("ijkl", "abcd"));
    }
    @Test
    public void test5() throws Exception {
        Assert.assertEquals(1, StringCompare.countChar("abij", "aijb"));
    }
    
    @Test
    public void test6() throws Exception {
        Assert.assertEquals(-1, StringCompare.countChar("abij", "aijbc"));
    }
    
    @Test
    public void test7() throws Exception {
        Assert.assertEquals(0, StringCompare.countChar("", ""));
    }
}
