package org.example.numberToWords;

public interface NumberToWordsIDImpl {
    /***
     * function convertNumberToWords takes long of number and convert to indonesian words
     * @param number  constraints: from 0 to 999,999,999,999,999
     * @return string words constraints from 0 to 999,999,999,999,999 (triliun)
     ***/
    String convertNumberToWords(long number);
}
