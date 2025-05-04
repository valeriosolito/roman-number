////////////////////////////////////////////////////////////////////
// Valerio Solito 2113178
// Bilal Sabic 2111022
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("LXX", IntegerToRoman.convert(70));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CCC", IntegerToRoman.convert(300));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
    }
}