package dk.cvvand.quarterpastfuzzy;

import java.util.Calendar;

public class FuzzyStringConverter implements TimeToFuzzyStringConverter {
    @Override
    public String convert(Calendar now) {

        String fuzzy = "";

        // Round minutes to nearest multiple of 5
        int minute = Math.round((float)now.get(Calendar.MINUTE) / 5)*5;
        int hour = now.get(Calendar.HOUR);
        switch(minute) {
            case 5:
                fuzzy += "fem over ";
                break;
            case 10:
                fuzzy += "ti over ";
                break;
            case 15:
                fuzzy += "kvart over ";
                break;
            case 20:
                fuzzy += "tyve over ";
                break;
            case 25:
                fuzzy += "fem i halv ";
                hour = (hour+1)%12;
                break;
            case 30:
                fuzzy += "halv ";
                hour = (hour+1)%12;
                break;
            case 35:
                fuzzy += "fem over halv ";
                hour = (hour+1)%12;
                break;
            case 40:
                fuzzy += "tyve i ";
                hour = (hour+1)%12;
                break;
            case 45:
                fuzzy += "kvart i ";
                hour = (hour+1)%12;
                break;
            case 50:
                fuzzy += "ti i ";
                hour = (hour+1)%12;
                break;
            case 55:
                fuzzy += "fem i ";
                hour = (hour+1)%12;
                break;
            case 60:
                hour = (hour+1)%12;
                break;
            default:
                // Do nothing
        }

        switch(hour) {
            case 0:
                fuzzy += "tolv";
                break;
            case 1:
                fuzzy += "et";
                break;
            case 2:
                fuzzy += "to";
                break;
            case 3:
                fuzzy += "tre";
                break;
            case 4:
                fuzzy += "fire";
                break;
            case 5:
                fuzzy += "fem";
                break;
            case 6:
                fuzzy += "seks";
                break;
            case 7:
                fuzzy += "syv";
                break;
            case 8:
                fuzzy += "otte";
                break;
            case 9:
                fuzzy += "ni";
                break;
            case 10:
                fuzzy += "ti";
                break;
            case 11:
                fuzzy += "elleve";
                break;
            default:
                // Do nothing
        }

        return fuzzy;

    }
}
