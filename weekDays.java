import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        
        for (int i=0;i<t;i++){
            
            String dateStr=sc.nextLine();
            LocalDate date=LocalDate.parse(dateStr, formatter);
            String week=date.getDayOfWeek().toString();
            
            if(week=="SUNDAY"){
                System.out.println("Sunday");
            }
            if(week=="MONDAY"){
                System.out.println("Monday");
            }
            if(week=="TUESDAY"){
                System.out.println("Tuesday");
            }
            if(week=="WEDNESDAY"){
                System.out.println("Wednesday");
            }
            if(week=="THURSDAY"){
                System.out.println("Thursday");
            }
            if(week=="FRIDAY"){
                System.out.println("Friday");
            }
            if(week=="SATURDAY"){
                System.out.println("Saturday");
            }
        }
        sc.close();
    }
}





// Week Days 
// Description

// Given a date, return the corresponding day of the week for that date.

// The input is given a string day/month/year

// Return the answer as one of the following values{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

// Note:-

// 1. You should not use any in-built functions or imports, for example,import calendar

// 2. You need to implement everything right from the scratch


// Input
// Input Format

// The first line contains the number of testcases T

// For each testcase:

// The first and only line contains the date

// Constraints

// 1<=T<=100

// 0<=Year<=9999

// 1<=month<=12

// 1<=date<=31


// Output
// For each testcase ,print the day which occurs on the given date.


// Sample Input 1 

// 3
// 9/2/2025
// 1/2/2017
// 21/2/1989
// Sample Output 1

// Sunday
// Wednesday
// Tuesday