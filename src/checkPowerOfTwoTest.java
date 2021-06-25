import org.junit.Test;

import static org.junit.Assert.*;

public class checkPowerOfTwoTest {

    @Test
    public void isPower(){
        checkPowerOfTwo test = new checkPowerOfTwo();
        boolean result1 = test.isPower(16);
        boolean result2 = test.isPower(0);
        boolean result3 = test.isPower(1);
        boolean result4 = test.isPower(3);
        boolean result5 = test.isPower(4);


        assertEquals(true,result1);
        assertEquals(false,result2);
        assertEquals(true,result3);
        assertEquals(false,result4);
        assertEquals(true,result5);
    }


}