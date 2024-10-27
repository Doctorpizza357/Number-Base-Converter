import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testDecimalToBinary() {
        assertEquals("1010", decimalToBinary(10));
        assertEquals("0", decimalToBinary(0));
        assertEquals("1111", decimalToBinary(15));
        assertEquals("1", decimalToBinary(1));
        assertEquals("10", decimalToBinary(2));
        assertEquals("11111111", decimalToBinary(255));
        assertEquals("1111111111", decimalToBinary(1023));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals(10, binaryToDecimal("1010"));
        assertEquals(0, binaryToDecimal("0"));
        assertEquals(15, binaryToDecimal("1111"));
        assertEquals(1, binaryToDecimal("1"));
        assertEquals(2, binaryToDecimal("10"));
        assertEquals(255, binaryToDecimal("11111111"));
        assertEquals(1023, binaryToDecimal("1111111111"));

    }

    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}