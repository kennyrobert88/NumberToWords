package org.example.numberToWords;

public interface NumberToWordsIDImpl {
    /***
     * function convertNumberToWords takes long of number and convert to indonesian words
     * @param Long number  constraints: from 0 to 999,999,999,999,999
     * @return String words constraints from 0 to 999,999,999,999,999 (triliun)
     ***/
    String convertNumberToWords(Long number);

    /***
     * function convertNumberToWords takes long of number and convert to indonesian words
     * @param Integer number  constraints: from 0 to 999,999,999,999,999
     * @return String words constraints from 0 to 999,999,999,999,999 (triliun)
     ***/
    String convertNumberToWords(Integer number);
}
