
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDigitsTest {

    @Test
    public void testDigits() {
        assertEquals(true, ShareDigit.SDmethod(14, 43));
        assertEquals(true, ShareDigit.SDmethod(99, 39));
        assertEquals(false, ShareDigit.SDmethod(22, 65));
        assertEquals(false, ShareDigit.SDmethod(11, 88));
    }
}
