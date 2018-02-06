package com.xcjaas.mediation.utils;


import java.util.Date;

/**
 * Created by Administrator on 2018\2\6 0006.
 */
public class DateUtil {

    private static java.sql.Date date;

    private DateUtil() {
    }

    public static java.sql.Date getDate() {
        if (date == null) {
            date = new java.sql.Date(new Date().getTime());
        }
        return date;
    }

}
