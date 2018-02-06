package com.xcjaas.mediation.utils;



import java.util.Date;

/**
 * Created by Administrator on 2018\2\6 0006.
 */
public class DateUtil {

    private java.sql.Date date;

    private DateUtil() {
    }
    public static void getDate(){

    }

    public static void main(String[] args) {
        java.sql.Date time= new java.sql.Date(new Date().getTime());
        System.out.println(time);
    }
}
