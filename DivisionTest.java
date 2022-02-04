import static org.junit.Assert.*;
import org.junit.*;

public class DivisionTest{
    @Test
    public void testDivide(){
        Division division = new Division();
        double x = 1;
        double y = 2;
        assertEquals(x/y, division.divide(x, y), 0.7);
    }
}