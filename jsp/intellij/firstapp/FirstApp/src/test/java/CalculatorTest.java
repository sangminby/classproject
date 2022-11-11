import com.firstcoding.firstapp.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        System.out.println("test : add()");
        Calculator cal = new Calculator();
        Assertions.assertEquals(12, cal.add(10,2), "add(10,2) -> 12 테스트");
    }

    @Test
    public void testSub() {

        Calculator cal = new Calculator();
        Assertions.assertEquals(8, cal.sub(10,2),"sub(10,2) 테스트");
    }

    @Test
    public void testMul() {

        Calculator cal = new Calculator();
        Assertions.assertEquals(8, cal.mul(10,2),"mul(10,2) 테스트");
    }

    @Test
    public void testDiv() {

        Calculator cal = new Calculator();
        Assertions.assertEquals(8, cal.div(10,2),"div(10,2) 테스트");
    }

}
