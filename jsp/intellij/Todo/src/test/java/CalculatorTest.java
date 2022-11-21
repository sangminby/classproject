import com.firstcoding.todo.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal;

    @BeforeEach
    public void setup(){
        System.out.println("@BeforeEach");
        cal = new Calculator();
    }

    @Test
    public void testAdd(){
        System.out.println("test add()");

//        Calculator cal = new Calculator();
        Assertions.assertEquals(12, cal.add(10, 2), "add(10,2) => 12 테스트");

    }

    @Test
    public void testSub(){
        System.out.println("test sub()");

//        Calculator cal = new Calculator();
        Assertions.assertEquals(8, cal.sub(10, 2), "sub(10,2) => 8 테스트");
    }

    @Test
    public void testMul(){
        System.out.println("test mul()");

//        Calculator cal = new Calculator();
        Assertions.assertEquals(20, cal.mul(10, 2), "mul(10,2) => 20 테스트");
    }

    @Test
    public void testDiv(){
        System.out.println("test div()");

//        Calculator cal = new Calculator();
        Assertions.assertEquals(5, cal.div(10, 2), "div(10,2) => 5 테스트");
    }

    @Test
    public void test(){
//        Assertions.fail("테스트 미 진행");
//        Assertions.assertTrue(false, "테스트하는 메소드의 결과값이 true면 성공");
//        Assertions.assertNull(null, "테스트의 반환값이 Null이면 성공");
//        Assertions.assertNotNull(new Object(), "메소드의 반환값이 null이 아니면 성공");
    }
}
