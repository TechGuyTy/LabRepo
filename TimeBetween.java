package timeBetween;


import java.util.Calendar;
import java.util.Scanner;
 
/*
 * Here we will learn to calculate the difference in days between two date.
 * There is Java API(JODA Api) available which can also be used to calculate difference between date.
 * But here we will talk about the option available in Java only.
 */
public class TimeBetween {
 
 public static void main(String args[]) {
 
 
 // Create Calendar instance
 Calendar calendar1 = Calendar.getInstance();
 Calendar calendar2 = Calendar.getInstance();
 
 
 
 System.out.println("Enter a start year");
 Scanner year1 = new Scanner(System.in);
 
 System.out.println("Enter a start month");
 Scanner mo1 = new Scanner(System.in);
 
 System.out.println("Enter a start day");
 Scanner day1 = new Scanner(System.in);
 
 System.out.println("Enter an end year");
 Scanner year2 = new Scanner(System.in);
 
 System.out.println("Enter an end month");
 Scanner mo2 = new Scanner(System.in);
 
 System.out.println("Enter an end day");
 Scanner day2 = new Scanner(System.in);
 



 


 
 int yearS = year1.nextInt();
 int moS = mo1.nextInt();
 int dayS = day1.nextInt();
 int yearE = year2.nextInt();
 int moE = mo2.nextInt();
 int dayE = day2.nextInt();
 
 
 
 // Set the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH.
 calendar1.set(yearS, moS, dayS);
 calendar2.set(yearE, moE, dayE);
 
 /*
 * Use getTimeInMillis() method to get the Calendar's time value in
 * milliseconds. This method returns the current time as UTC
 * milliseconds from the epoch
 */
 long miliSecondForDate1 = calendar1.getTimeInMillis();
 long miliSecondForDate2 = calendar2.getTimeInMillis();

 // Calculate the difference in millisecond between two dates
 long diffInMilis = miliSecondForDate2 - miliSecondForDate1;
 
 /*
 * Now we have difference between two date in form of millsecond we can
 * easily convert it Minute / Hour / Days by dividing the difference
 * with appropriate value. 1 Second : 1000 milisecond 1 Hour : 60 * 1000
 * millisecond 1 Day : 24 * 60 * 1000 milisecond
 */
 
 long diffInYears = diffInMilis / (24 * 60 * 60 * 1000) / 365;
 System.out.println("Difference in Years : " + diffInYears);
 long remainder = diffInMilis % ((24 * 60 * 60) / 365);
 System.out.println(remainder);
 long diffInDays = remainder / ( 24 * 60 * 60 * 1000 ) ;
 System.out.println("Difference In Days : " + diffInDays);
 
 
 
//THIS IS THE OLD CODE THAT WORKS! 
// long diffInSecond = diffInMilis / 1000;
// long diffInMinute = diffInMilis / (60 * 1000);
// long diffInHour = diffInMilis / (60 * 60 * 1000);
// long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);
// long diffInMos = diffInMilis / (30 * 24 * 60 * 60 * 1000);
// 
// 
// System.out.println("Difference in Seconds : " + diffInSecond);
// System.out.println("Difference in Minute : " + diffInMinute);
// System.out.println("Difference in Hours : " + diffInHour);
// System.out.println("Difference in Days : " + diffInDays);
// System.out.println("Difference in Months : " + diffInMos);
// System.out.println(miliSecondForDate1);
// System.out.println(miliSecondForDate2);
 
 }
 
}


