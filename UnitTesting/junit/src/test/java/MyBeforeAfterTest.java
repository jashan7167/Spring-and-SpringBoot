import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyBeforeAfterTest {
    @BeforeAll
    static void beforeAll()
    {
        System.out.println("Before All Test Case");
    }
    @BeforeEach
    @Test
    void test1() {
        System.out.println("test1");
    }


    @Test
    void test2() {
        System.out.println("test2");
    }


    @Test
    void test3() {
        System.out.println("test3");
    }
}
