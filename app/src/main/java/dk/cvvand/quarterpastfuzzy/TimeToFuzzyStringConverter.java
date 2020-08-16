package dk.cvvand.quarterpastfuzzy;

import java.util.Calendar;

public interface TimeToFuzzyStringConverter {

    String convert(Calendar now);

}
