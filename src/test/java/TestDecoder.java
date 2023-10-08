
import com.denys.Decoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDecoder {

    @Test
    public void testVowelsToLetters() {
        assertEquals("testing", Decoder.vowelsToLetters("t2st3ng"));
        assertEquals("elephant", Decoder.vowelsToLetters("2l2ph1nt"));
        assertEquals("aPPLe", Decoder.vowelsToLetters("1PPL2"));
        assertEquals("eunoia", Decoder.vowelsToLetters("25n431"));

    }

    @Test
    public void testLettersToPrevious() {
        assertEquals("testing", Decoder.lettersToPrevious("uftujoh"));
        assertEquals("butter", Decoder.lettersToPrevious("cvuufs"));
        assertEquals("oRaNGe", Decoder.lettersToPrevious("pSbOHf"));
        assertEquals("3456", Decoder.lettersToPrevious("3456"));
    }

    @Test
    public void testDecode() {
        assertEquals("testing", Decoder.decode("t2st3ng"));
        assertEquals("testing", Decoder.decode("uftujoh"));
        assertEquals("98754", Decoder.decode("98754"));
        assertEquals("1452", Decoder.decode("1452"));
    }
}