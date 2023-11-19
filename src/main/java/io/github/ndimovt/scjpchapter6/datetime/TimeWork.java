package io.github.ndimovt.scjpchapter6.datetime;

import java.text.DateFormat;
import java.util.*;

public class TimeWork {
    private Calendar secCal = Calendar.getInstance();
    private Date date;
    public Date getDate(){
        return secCal.getTime();
    }
    public String addYear(int number){
        secCal.add(Calendar.YEAR,number);
        date = secCal.getTime();
        return date.toString();
    }
    public String removeHour(int hour){
        secCal.add(Calendar.HOUR, -hour);
        date = secCal.getTime();
        return date.toString();
    }
    public String nyTime(){
        secCal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        return "New York local time: "+secCal.get(Calendar.HOUR_OF_DAY)+":"+secCal.get(Calendar.MINUTE)+":"+secCal.get(Calendar.SECOND);
    }
    public String brazilTime(){
        date = secCal.getTime();
        Locale brLocal = new Locale("pt","BR");
        DateFormat brDf = DateFormat.getDateInstance(DateFormat.FULL,brLocal);
        return brDf.format(date);
    }
    public String tokyoTime(){
        secCal.setTimeZone(TimeZone.getTimeZone("Japan/Tokyo"));
        return "Tokyo local time: " + secCal.get(Calendar.HOUR_OF_DAY)+":"+secCal.get(Calendar.MINUTE)+":"+secCal.get(Calendar.SECOND);
    }

}
