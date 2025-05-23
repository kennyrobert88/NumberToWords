/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.numberToWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberToWordsIDTest {
    NumberToWordsID classUnderTest = new NumberToWordsID();

    @Test
    void convertToWordsTestFailed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> classUnderTest.convertNumberToWords(-1L));
        Assertions.assertThrows(IllegalArgumentException.class, () -> classUnderTest.convertNumberToWords((Long) null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> classUnderTest.convertNumberToWords(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> classUnderTest.convertNumberToWords((Integer) null));
    }

    @Test
    void convertToWordsTest0() {
        Assertions.assertEquals("Nol", classUnderTest.convertNumberToWords(0L));
        Assertions.assertEquals("Nol", classUnderTest.convertNumberToWords(0));
    }

    @Test
    void convertToWordsTest1() {
        // 10
        Assertions.assertEquals("Sepuluh", classUnderTest.convertNumberToWords(10L));
        Assertions.assertEquals("Sepuluh", classUnderTest.convertNumberToWords(10));
        // 50
        Assertions.assertEquals("Lima Puluh", classUnderTest.convertNumberToWords(50L));
        Assertions.assertEquals("Lima Puluh", classUnderTest.convertNumberToWords(50));
        // 60
        Assertions.assertEquals("Enam Puluh", classUnderTest.convertNumberToWords(60L));
        Assertions.assertEquals("Enam Puluh", classUnderTest.convertNumberToWords(60));
        // 70
        Assertions.assertEquals("Tujuh Puluh", classUnderTest.convertNumberToWords(70L));
        Assertions.assertEquals("Tujuh Puluh", classUnderTest.convertNumberToWords(70));
        // 80
        Assertions.assertEquals("Delapan Puluh", classUnderTest.convertNumberToWords(80L));
        Assertions.assertEquals("Delapan Puluh", classUnderTest.convertNumberToWords(80));
        // 90
        Assertions.assertEquals("Sembilan Puluh", classUnderTest.convertNumberToWords(90L));
        Assertions.assertEquals("Sembilan Puluh", classUnderTest.convertNumberToWords(90));
        // 100
        Assertions.assertEquals("Seratus", classUnderTest.convertNumberToWords(100L));
        Assertions.assertEquals("Seratus", classUnderTest.convertNumberToWords(100));
        // 150
        Assertions.assertEquals("Seratus Lima Puluh", classUnderTest.convertNumberToWords(150L));
        Assertions.assertEquals("Seratus Lima Puluh", classUnderTest.convertNumberToWords(150));

    }

    @Test
    void convertToWordsRibu() {
        // 1000
        Assertions.assertEquals("Satu Ribu", classUnderTest.convertNumberToWords(1000L));
        Assertions.assertEquals("Satu Ribu", classUnderTest.convertNumberToWords(1000));
        // 2000
        Assertions.assertEquals("Dua Ribu", classUnderTest.convertNumberToWords(2000L));
        Assertions.assertEquals("Dua Ribu", classUnderTest.convertNumberToWords(2000));
        // 3000
        Assertions.assertEquals("Tiga Ribu", classUnderTest.convertNumberToWords(3000L));
        Assertions.assertEquals("Tiga Ribu", classUnderTest.convertNumberToWords(3000));
        // 4000
        Assertions.assertEquals("Empat Ribu", classUnderTest.convertNumberToWords(4000L));
        Assertions.assertEquals("Empat Ribu", classUnderTest.convertNumberToWords(4000));
        // 5000
        Assertions.assertEquals("Lima Ribu", classUnderTest.convertNumberToWords(5000L));
        Assertions.assertEquals("Lima Ribu", classUnderTest.convertNumberToWords(5000));
        // 6000
        Assertions.assertEquals("Enam Ribu", classUnderTest.convertNumberToWords(6000L));
        Assertions.assertEquals("Enam Ribu", classUnderTest.convertNumberToWords(6000));
        // 7000
        Assertions.assertEquals("Tujuh Ribu", classUnderTest.convertNumberToWords(7000L));
        Assertions.assertEquals("Tujuh Ribu", classUnderTest.convertNumberToWords(7000));
        // 8000
        Assertions.assertEquals("Delapan Ribu", classUnderTest.convertNumberToWords(8000L));
        Assertions.assertEquals("Delapan Ribu", classUnderTest.convertNumberToWords(8000));
        // 9000
        Assertions.assertEquals("Sembilan Ribu", classUnderTest.convertNumberToWords(9000L));
        Assertions.assertEquals("Sembilan Ribu", classUnderTest.convertNumberToWords(9000));
        // 10000
        Assertions.assertEquals("Sepuluh Ribu", classUnderTest.convertNumberToWords(10000L));
        Assertions.assertEquals("Sepuluh Ribu", classUnderTest.convertNumberToWords(10000));
    }

    @Test
    void convertToWordsJuta() {
        // 1000
        Assertions.assertEquals("Satu Juta", classUnderTest.convertNumberToWords(1000000L));
        Assertions.assertEquals("Satu Juta", classUnderTest.convertNumberToWords(1000000));
        // 2000
        Assertions.assertEquals("Dua Juta", classUnderTest.convertNumberToWords(2000000L));
        Assertions.assertEquals("Dua Juta", classUnderTest.convertNumberToWords(2000000));
        // 3000
        Assertions.assertEquals("Tiga Juta", classUnderTest.convertNumberToWords(3000000L));
        Assertions.assertEquals("Tiga Juta", classUnderTest.convertNumberToWords(3000000));
        // 4000
        Assertions.assertEquals("Empat Juta", classUnderTest.convertNumberToWords(4000000L));
        Assertions.assertEquals("Empat Juta", classUnderTest.convertNumberToWords(4000000));
        // 5000
        Assertions.assertEquals("Lima Juta", classUnderTest.convertNumberToWords(5000000L));
        Assertions.assertEquals("Lima Juta", classUnderTest.convertNumberToWords(5000000));
        // 6000
        Assertions.assertEquals("Enam Juta", classUnderTest.convertNumberToWords(6000000L));
        Assertions.assertEquals("Enam Juta", classUnderTest.convertNumberToWords(6000000));
        // 7000
        Assertions.assertEquals("Tujuh Juta", classUnderTest.convertNumberToWords(7000000L));
        Assertions.assertEquals("Tujuh Juta", classUnderTest.convertNumberToWords(7000000));
        // 8000
        Assertions.assertEquals("Delapan Juta", classUnderTest.convertNumberToWords(8000000L));
        Assertions.assertEquals("Delapan Juta", classUnderTest.convertNumberToWords(8000000));
        // 9000
        Assertions.assertEquals("Sembilan Juta", classUnderTest.convertNumberToWords(9000000L));
        Assertions.assertEquals("Sembilan Juta", classUnderTest.convertNumberToWords(9000000));
        // 10000
        Assertions.assertEquals("Sepuluh Juta", classUnderTest.convertNumberToWords(10000000L));
        Assertions.assertEquals("Sepuluh Juta", classUnderTest.convertNumberToWords(10000000));
    }

    @Test
    void convertToWordsMiliar() {
        // 1000
        Assertions.assertEquals("Satu Miliar", classUnderTest.convertNumberToWords(1000000000L));
        Assertions.assertEquals("Satu Miliar", classUnderTest.convertNumberToWords(1000000000));
        // 2000
        Assertions.assertEquals("Dua Miliar", classUnderTest.convertNumberToWords(2000000000L));
        Assertions.assertEquals("Dua Miliar", classUnderTest.convertNumberToWords(2000000000));
        // 3000
        Assertions.assertEquals("Tiga Miliar", classUnderTest.convertNumberToWords(3000000000L));

        // 4000
        Assertions.assertEquals("Empat Miliar", classUnderTest.convertNumberToWords(4000000000L));

        // 5000
        Assertions.assertEquals("Lima Miliar", classUnderTest.convertNumberToWords(5000000000L));

        // 6000
        Assertions.assertEquals("Enam Miliar", classUnderTest.convertNumberToWords(6000000000L));

        // 7000
        Assertions.assertEquals("Tujuh Miliar", classUnderTest.convertNumberToWords(7000000000L));

        // 8000
        Assertions.assertEquals("Delapan Miliar", classUnderTest.convertNumberToWords(8000000000L));

        // 9000
        Assertions.assertEquals("Sembilan Miliar", classUnderTest.convertNumberToWords(9000000000L));

        // 10000
        Assertions.assertEquals("Sepuluh Miliar", classUnderTest.convertNumberToWords(10000000000L));

    }

    @Test
    void convertToWordsTriliun() {
        // 1000
        Assertions.assertEquals("Satu Triliun", classUnderTest.convertNumberToWords(1000000000000L));

        // 2000
        Assertions.assertEquals("Dua Triliun", classUnderTest.convertNumberToWords(2000000000000L));

        // 3000
        Assertions.assertEquals("Tiga Triliun", classUnderTest.convertNumberToWords(3000000000000L));

        // 4000
        Assertions.assertEquals("Empat Triliun", classUnderTest.convertNumberToWords(4000000000000L));

        // 5000
        Assertions.assertEquals("Lima Triliun", classUnderTest.convertNumberToWords(5000000000000L));

        // 6000
        Assertions.assertEquals("Enam Triliun", classUnderTest.convertNumberToWords(6000000000000L));

        // 7000
        Assertions.assertEquals("Tujuh Triliun", classUnderTest.convertNumberToWords(7000000000000L));

        // 8000
        Assertions.assertEquals("Delapan Triliun", classUnderTest.convertNumberToWords(8000000000000L));

        // 9000
        Assertions.assertEquals("Sembilan Triliun", classUnderTest.convertNumberToWords(9000000000000L));

        // 10000
        Assertions.assertEquals("Sepuluh Triliun", classUnderTest.convertNumberToWords(10000000000000L));

    }

    @Test
    void convertToWordsCustom() {
        Assertions.assertEquals("Satu Triliun Sembilan Ratus Sembilan Puluh Sembilan Miliar", classUnderTest.convertNumberToWords(1999000000000L));
        Assertions.assertEquals("Satu Triliun Sembilan Ratus Sembilan Puluh Sembilan Miliar Sembilan Ratus Juta", classUnderTest.convertNumberToWords(1999900000000L));
        Assertions.assertEquals("Sembilan Ratus Sembilan Puluh Sembilan Ribu", classUnderTest.convertNumberToWords(999000L));
        Assertions.assertEquals("Sembilan Ratus Sembilan Puluh Sembilan Ribu", classUnderTest.convertNumberToWords(999000));
        Assertions.assertEquals("Sembilan Ratus Tujuh Puluh Satu Ribu", classUnderTest.convertNumberToWords(971000L));
        Assertions.assertEquals("Sembilan Ratus Delapan Puluh Dua", classUnderTest.convertNumberToWords(982));
        Assertions.assertEquals("Sembilan Ratus Delapan Puluh Dua", classUnderTest.convertNumberToWords(982L));
    }
}
