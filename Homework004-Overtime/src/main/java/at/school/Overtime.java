package at.school;

import java.util.*;

public class Overtime {
    public static void main(String[] args) {
        int[] hourPerDay = {8, 10, 9, 10, 8, 12, 14, 9, 10};
        int startingDay = 46001;
        int startingDayDelta;
        int hourPerDayNormal = 8;
        int overtime = 0;
        switch (startingDay){
            case 1470098:
                startingDayDelta = 0;
                break;
            case 206655:
                startingDayDelta = 1;
                break;
            case 46001:
                startingDayDelta = 2;
                break;
            case 740573:
                startingDayDelta = 3;
                break;
            case 107476:
                startingDayDelta = 4;
                break;
            case 1353572:
                startingDayDelta = 5;
                break;
            default:
                startingDayDelta = 6;
        }
        for (int i = 0; i < hourPerDay.length; i++) {
            int overtimePerDay = (i + startingDayDelta) % 7 > 4 ? hourPerDay[i] : hourPerDay[i] - hourPerDayNormal;
            overtime +=  overtimePerDay;
            System.out.println("overtimePerDay = " + overtimePerDay);
        }
        System.out.println("overtime = " + overtime);
    }
}
