/**
 * This file illustrates the following concepts from Chapter 3 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Dates & Times
 * -Periods
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C3Demo3 {


    public static void main(String[] args) {

        demoDateTimeBasic();
        demoManipulateDateTime();
        demoPeriod();
        demoFormat();

    } //close method


    /**
     * Demo on creating Date/Time objects. Note that the constructor is not accessible for these classes and a static
     * method must be invoked.
     * */

    private static void demoDateTimeBasic(){

        //Two ways to create a date
        LocalDate date1 = LocalDate.of(2019, Month.JUNE, 16);
        LocalDate date2 = LocalDate.of(2019,6,16);
        //LocalDate date3 = LocalDate.of(2019,13,21);      //Creates an exception as there is no 13th month

        //Times can have hour,minute,seconds, and nanoseconds
        LocalTime time1 = LocalTime.of(6,16);
        LocalTime time2 = LocalTime.of(6,16,30);
        LocalTime time3 = LocalTime.of(6,16,47,1000);


        // Dates and Times can be done in one Object
        LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.JUNE,16,6,16,20,1000);

        LocalDateTime dateTime2 = LocalDateTime.of(date1,time1); //can use existing date and time objects to create
                                                                //a DateTime object

        //LocalDateTime dateTime3 = new LocalDateTime(); //The constructor for Date/Time objects has been marked private

    }//close method

    /**
     *Demo on how to add and subtract time and days. Note that Date, Time, and DateTime Objects are immutable so you
     * must point the reference at a new object when you move time/day backwards and forwards.
     * */

    private static void demoManipulateDateTime(){

        LocalDate date1 = LocalDate.of(2019, 7, 16);

        System.out.println(date1);

        date1 = date1.plusDays(2); //Date/Time objects are immutable so they must be assigned to a new object

        System.out.println(date1);

        date1 = date1.plusWeeks(3);

        System.out.println(date1);

        date1 = date1.minusMonths(2);

        System.out.println(date1);

        date1 = date1.minusYears(20);

        System.out.println(date1);

        //date1 = date1.minusHours(1); //This is a date object, not a Time or dateTime object

        LocalDate date2 = LocalDate.of(2019, Month.FEBRUARY, 21);
        LocalTime time2 = LocalTime.of(6,59,1);

        //LocalDateTime dateTime1 = LocalDateTime.of(time2,date2); //parameters must be date,time

        LocalDateTime dateTime2 = LocalDateTime.of(date2,time2).minusDays(2).plusHours(5);

        System.out.println(dateTime2);

        dateTime2.plusDays(4); //this result will be lost since dateTime2 is immutable

        System.out.println(dateTime2);

    } // close method

    /**
     * Periods can used to manipulate or compare with date objects. Since they are date oriented they don't work
     * with time objects
     * */

    private static void demoPeriod(){

        Period years = Period.ofYears(4);
        Period quarter = Period.ofMonths(3);
        Period fortNight = Period.ofWeeks(2);
        Period fortNightIndays = Period.ofDays(14);
        Period bundle = Period.of(1,1,1); //Period of years, months, and days

        //Period error = Period.ofDays(2).ofWeeks(2); //can't chain Periods together

        LocalDate date1 = LocalDate.of(2019, Month.JUNE, 30);
        LocalTime time1 = LocalTime.of(7, 17, 30);
        LocalDateTime dateTime1 = LocalDateTime.of(date1,time1);

        date1 = date1.plus(years);
        //time1 = time1.plus(years);      //throws an exception since time only includes a time element, not a date
        dateTime1 = dateTime1.plus(fortNight);


    } //close method

    /**
     * Method shows how Date/Time/DateTime Objects can be formatted
     * There are predefined formats or you can create your own
     *
     * The DateTime Formatter doesn't work with time objects
     * */

    private static void demoFormat(){


        //Create our Date/Time/DateTime objects

        LocalTime time = LocalTime.of(7,29,30);
        LocalDate date = LocalDate.of(2019, Month.JUNE, 23);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        //Create the formatters
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter fullDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter longDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);


        //Print out the results of the formatters
        System.out.println(shortDateTime.format(date));
        System.out.println(shortDateTime.format(dateTime));
        //System.out.println(shortDateTime.format(time));    //Needs a date element, throws exception


        System.out.println(mediumDateTime.format(date));
        System.out.println(mediumDateTime.format(dateTime));
        //System.out.println(mediumDateTime.format(time));

        System.out.println(fullDateTime.format(date));
        System.out.println(fullDateTime.format(dateTime));

        System.out.println(longDateTime.format(date));
        System.out.println(longDateTime.format(dateTime));

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(custom.format(dateTime));

        //You can build a custom parser to turn a String into Date
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date2 = LocalDate.parse("05 29 1977",parser);
        System.out.println(date2);


    }


} //close class
