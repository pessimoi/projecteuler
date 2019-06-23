package t19;

import java.util.HashMap;

public class MainT19 {

    public static void main(String[] args) {

        //  Counting Sundays
        //  Problem 19
        //  You are given the following information, but you may prefer to do some research for yourself.
        //
        //  *1 Jan 1900 was a Monday.
        //  *Thirty days has September,
        //  April, June and November.
        //  All the rest have thirty-one,
        //  Saving February alone,
        //  Which has twenty-eight, rain or shine.
        //  And on leap years, twenty-nine.
        //  *A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
        //
        //  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


        HashMap<Integer, Integer> months = new HashMap<>();

        months.put(1, 31);
        months.put(2, 28); //Need to set according to if starting year is leap or not
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        int year = 1900;
        int startYear = 1901;
        int month = 1;
        int day = 1;

        int endYear = 2000;
        int endMonth = 12;
        int endDay = 31;

        int days = 1;
        int sundays = 0;


        while(true){

            String weekday = "";

            switch (days % 7) {
                case 0 : weekday = "sunday";
                    break;
                case 1 : weekday = "monday";
                    break;
                case 2: weekday = "tuesday";
                    break;
                case 3: weekday = "wednesday";
                    break;
                case 4: weekday = "thursday";
                    break;
                case 5: weekday = "friday";
                    break;
                case 6: weekday = "saturday";
                    break;
            }

            if(days % 7 == 0  && year >= startYear && day == 1){
                weekday = "SPECIAL SUNDAY";
                sundays++;
            }

            System.out.println(day + "-" + month + "-" + year + " " + weekday);

            if(month == 12 && day == months.get(month)){    // Year addition
                year++;
                month = 1;
                day = 1;
                if((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0){
                    months.put(2, 29);  // Leap year
                } else {
                    months.put(2, 28);  // Not an leap year
                }
            } else if(day == months.get(month)){ // Month addition
                month++;
                day = 1;
            } else {
                day++;
            }

            days++;

            if(year == endYear && month == endMonth && day == endDay){  //End condition
                break;
            }

        }

        System.out.println(sundays);

    }

}
