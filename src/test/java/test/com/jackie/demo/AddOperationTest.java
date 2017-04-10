package test.com.jackie.demo;


import com.jackie.demo.AddOperation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by luhaiming on 2017/4/10 0010.
 */
public class AddOperationTest {
    AddOperation a;

    @Before
    public void before() throws Exception {
        a = new AddOperation();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(int a, int b)
     */
    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(3, a.add(1, 2));
    }
}
