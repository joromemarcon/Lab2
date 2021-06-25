import org.junit.Test;

import static org.junit.Assert.*;

public class checkPowerOfTwoTest {

    @Test
    public void isPower(){
        checkPowerOfTwo test = new checkPowerOfTwo();
        int result1 = test.isPower(16);
        int result2 = test.isPower(0);
        int result3 = test.isPower(1);
        int result4 = test.isPower(4);
        assertEquals(1,result1);
        assertEquals(0,result2);
        assertEquals(1,result3);
        assertEquals(1,result4);
    }


}