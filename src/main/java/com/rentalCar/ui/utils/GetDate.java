package com.rentalCar.ui.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class GetDate {

    private GetDate() {}

    public static String getDay() {
        DateFormat dateFormat = new SimpleDateFormat("dd");
        Date date = new Date();
        String day = dateFormat.format(date);
        return day;
    }

    public static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        Date dateFunction = new Date();
        String date = dateFormat.format(dateFunction);

        return date;
    }
}
