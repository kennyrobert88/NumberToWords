package org.example.numberToWords;

public class Constants {
    public static final String[] BELOW_TWENTY_ID = {
            "", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh",
            "Sebelas", "Dua Belas", "Tiga Belas", "Empat Belas", "Lima Belas", "Enam Belas", "Tujuh Belas",
            "Delapan Belas", "Sembilan Belas"
    };

    public static final String[] TENS_ID = {
            "", "", "Dua Puluh", "Tiga Puluh", "Empat Puluh", "Lima Puluh", "Enam Puluh",
            "Tujuh Puluh", "Delapan Puluh", "Sembilan Puluh"
    };

    public static final String[] THOUSANDS_ID = {"", "Ribu", "Juta", "Miliar", "Triliun"};
    public static final long MIN_VALUE = 0;
    public static final long MAX_VALUE = 999_999_999_999L;
    public static final String ZERO_ID = "Nol";
    public static final String ONE_HUNDRED_ID = "Seratus";
}
