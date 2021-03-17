package testingpackage;

import java.awt.Point;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//import org.junit.Test;
//import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitAriTestingTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUpMethod() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }



    @AfterEach
    public void tearDown() {

        System.setOut(standardOut);
    }

    static int[] intArray = new int[]  {1,2,3,4,5,6,7,8,9,10};

    @Test
    void testGivenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        
        JunitAriTesting numberPrinting = new JunitAriTesting();
        
        
        numberPrinting.printNumber(intArray);
        
        assertEquals("1,2,3,4,5,6,7,8,9,10", outputStreamCaptor.toString()
            .trim());
    
    }

    Point a = new Point(1,2);
    Point b = new Point(-3,4);
    Point c = new Point(-5, -6);

    @Test
    void testArea() {
        JunitAriTesting ar = new JunitAriTesting();
        int areaOuput = ar.countTriangleArea(a,b,c);
        assertEquals(22, areaOuput);


    }

    
}