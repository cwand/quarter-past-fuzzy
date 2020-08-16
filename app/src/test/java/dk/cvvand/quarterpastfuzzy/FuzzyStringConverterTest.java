package dk.cvvand.quarterpastfuzzy;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class FuzzyStringConverterTest {

    @Test
    public void allValuesZeroShouldReturn_tolv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("tolv", fuzzy);
    }

    @Test
    public void hourOneOtherValuesZeroShouldReturn_et() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 1);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("et", fuzzy);
    }

    @Test
    public void hourTwoToElevenOtherValuesZeroShouldReturn_to_til_elleve() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 2);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("to", fuzzy);

        cal.set(Calendar.HOUR, 3);
        fuzzy = c.convert(cal);
        assertEquals("tre", fuzzy);

        cal.set(Calendar.HOUR, 4);
        fuzzy = c.convert(cal);
        assertEquals("fire", fuzzy);

        cal.set(Calendar.HOUR, 5);
        fuzzy = c.convert(cal);
        assertEquals("fem", fuzzy);

        cal.set(Calendar.HOUR, 6);
        fuzzy = c.convert(cal);
        assertEquals("seks", fuzzy);

        cal.set(Calendar.HOUR, 7);
        fuzzy = c.convert(cal);
        assertEquals("syv", fuzzy);

        cal.set(Calendar.HOUR, 8);
        fuzzy = c.convert(cal);
        assertEquals("otte", fuzzy);

        cal.set(Calendar.HOUR, 9);
        fuzzy = c.convert(cal);
        assertEquals("ni", fuzzy);

        cal.set(Calendar.HOUR, 10);
        fuzzy = c.convert(cal);
        assertEquals("ti", fuzzy);

        cal.set(Calendar.HOUR, 11);
        fuzzy = c.convert(cal);
        assertEquals("elleve", fuzzy);
    }

    @Test
    public void hourZeroMinuteFifteenSecondZeroShouldReturn_kvart_over_tolv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 15);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("kvart over tolv", fuzzy);
    }

    @Test
    public void hourZeroMinuteThirteenSecondZeroShouldReturn_kvart_over_tolv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 13);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("kvart over tolv", fuzzy);
    }

    @Test
    public void hourSevenMinuteTwoSecondZeroShouldReturn_syv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 2);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("syv", fuzzy);
    }

    @Test
    public void hourSevenMinuteFourSecondZeroShouldReturn_fem_over_syv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 4);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("fem over syv", fuzzy);
    }

    @Test
    public void hourFiveMinuteElevenSecondZeroShouldReturn_ti_over_fem() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 5);
        cal.set(Calendar.MINUTE, 11);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("ti over fem", fuzzy);
    }

    @Test
    public void hourEleventMinuteNineteenSecondZeroShouldReturn_tyve_minutter_over_elleve() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 11);
        cal.set(Calendar.MINUTE, 19);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("tyve over elleve", fuzzy);
    }

    @Test
    public void hourTenMinuteTwentythreeSecondZeroShouldReturn_fem_i_halv_elleve() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 10);
        cal.set(Calendar.MINUTE, 23);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("fem i halv elleve", fuzzy);
    }

    @Test
    public void hourElevenMinuteTwentyeightSecondZeroShouldReturn_halv_tolv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 11);
        cal.set(Calendar.MINUTE, 28);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("halv tolv", fuzzy);
    }

    @Test
    public void hourZeroMinuteThirtysevenSecondZeroShouldReturn_fem_over_halv_et() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 37);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("fem over halv et", fuzzy);
    }

    @Test
    public void hourTwoMinuteFortySecondZeroShouldReturn_tyve_i_tre() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 2);
        cal.set(Calendar.MINUTE, 40);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("tyve i tre", fuzzy);
    }

    @Test
    public void hourFiveMinuteFortyfourSecondsZeroShouldReturn_kvart_i_seks() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 5);
        cal.set(Calendar.MINUTE, 44);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("kvart i seks", fuzzy);
    }

    @Test
    public void hourSixMinuteFiftyoneSecondsZeroShouldReturn_ti_i_syv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 6);
        cal.set(Calendar.MINUTE, 51);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("ti i syv", fuzzy);
    }

    @Test
    public void hourSevenMinuteFiftysevenSecondsZeroShouldReturn_fem_i_otte() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 57);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("fem i otte", fuzzy);
    }

    @Test
    public void hourSevenMinuteFiftyeightSecondsZeroShouldReturn_otte() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 58);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("otte", fuzzy);
    }

    @Test
    public void hourSevenMinuteOneSecondsZeroShouldReturn_syv() {
        FuzzyStringConverter c = new FuzzyStringConverter();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 1);
        cal.set(Calendar.SECOND, 0);
        String fuzzy = c.convert(cal);
        assertEquals("syv", fuzzy);
    }

}