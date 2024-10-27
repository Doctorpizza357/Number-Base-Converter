import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testsTest {

    @Test
    public void testDecimalToBinary() {
        assertEquals("1010", decimalToBinary(10));
        assertEquals("0", decimalToBinary(0));
        assertEquals("1111", decimalToBinary(15));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals(10, binaryToDecimal("1010"));
        assertEquals(0, binaryToDecimal("0"));
        assertEquals(15, binaryToDecimal("1111"));
    }

    // Assuming these methods exist in the `tests` class
    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}