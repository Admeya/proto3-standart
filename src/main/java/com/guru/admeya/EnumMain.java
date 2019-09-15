package com.guru.admeya;

import static my.enums.WeekDays.*;
import static my.enums.WeekDays.Days.MONDAY;

public class EnumMain {
    public static void main(String[] args) {
        DayOfWeek.Builder builder = DayOfWeek.newBuilder();
        builder.setDayOfWeek(MONDAY);

        DayOfWeek msg = builder.build();

        System.out.println(msg);
    }
}
