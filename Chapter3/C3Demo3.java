/**
 * This file illustrates the following concepts from Chapter 3 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Dates & Times
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter3;

import java.time.*;

public class C3Demo3 {


    public static void main() {

        demoDateBasic();


    }


    private static void demoDateBasic(){

        //Two ways to create a date
        LocalDate date1 = LocalDate.of(2019, Month.JUNE, 16);
        LocalDate date2 = LocalDate.of(2019,6,16);
        LocalDate date3 = LocalDate.of(2019,13,21);

        //Times can have hour,minute,seconds, and nanoseconds
        LocalTime time1 = LocalTime.of(6,16);
        LocalTime time2 = LocalTime.of(6,16,30);
        LocalTime time3 = LocalTime.of(6,16,47,1000);


        // Dates and Times can be done in one Object
        LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.JUNE,16,6,16,20,1000);

        LocalDateTime dateTime2 = LocalDateTime.of(date1,time1); //can use existing date and time objects to create
                                                                 //a DateTime object

        //LocalDateTime dateTime3 = new LocalDateTime(); //The constructor for Date/Time objects has been marked private



    }





}
