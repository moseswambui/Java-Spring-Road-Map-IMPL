package Intro;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DatesTime {
    public static void main(String[] args) {
        /*
        1. Use the Date class to get the current date and time.
        2. Use the Calendar class to get the current date and time,
        manipulate date/time values, and set a specific date.
        3. Print the current date and time, future date after adding days, and a specific date.
         */
        // Creating a Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Creating a Calendar object
        Calendar calendar = Calendar.getInstance();

        // Getting current date and time using Calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Adding 1 as months are zero-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Current Date using Calendar: " + day + "/" + month + "/" + year);
        System.out.println("Current Time using Calendar: " + hour + ":" + minute + ":" + second);

        // Manipulating Calendar date/time values
        calendar.add(Calendar.DAY_OF_MONTH, 7); // Adding 7 days to the current date
        Date futureDate = calendar.getTime();
        System.out.println("Date after adding 7 days: " + futureDate);

        // Setting a specific date using Calendar
        calendar.set(2024, Calendar.DECEMBER, 25); // Setting date to 25th December 2024
        Date specificDate = calendar.getTime();
        System.out.println("Specific Date: \n\n" + specificDate);

        //Display the current time in UTC (Coordinated Universal Time) from Nairobi

        // Get the current time in Nairobi timezone
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Africa/Nairobi"));
        System.out.println("Current time in Nairobi: " + localDateTime);

        // Convert Nairobi time to UTC
        ZonedDateTime nairobiTime = ZonedDateTime.of(localDateTime, ZoneId.of("Africa/Nairobi"));
        ZonedDateTime utcTime = nairobiTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("Current time in UTC Nairobi: " + utcTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
