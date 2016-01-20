package test.com.controller;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
/**
 * JUnit Suite Test
 * @author mkyong
 *
 */
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestController.class,
        Test1Controller.class
})
public class TestSuite1 {
}


// Create a test suite which will initialize the applicationContext. 
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
@Transactional
public class SuiteTest {

    @Test public void run() {
        JUnitCore.runClasses(Test1.class, Test2.class);
    }

}*/