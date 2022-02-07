package com.leetcode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateChecker {

    public static void main(String[] args) {

        Boolean yp = true;
        Boolean ts = true;

        String xys = yp&&ts?"Y":"N";
        System.out.println("----- "+xys);
    }


}
