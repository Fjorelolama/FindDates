import java.util.Scanner;

public class FindDates {
    public static void main(String[] args) {
       int  T_day = 6;
       int E_days = 6;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        T_day = userInput.nextInt();



        if (T_day == 0) {
            System.out.println("Today is Sunday");
        } else if (T_day == 1) {
            System.out.println("Today is Monday");
        } else if (T_day == 2) {
            System.out.println("Today is Tuesday ");
        } else if (T_day == 3) {
            System.out.println("Today is Wednesday");
        } else if (T_day == 4) {
            System.out.println("Today is Thursday");
        } else if (T_day == 5) {
            System.out.println("Today is Friday");
        } else if (T_day == 6) {
            System.out.println("Today is Saturday");
        }

        System.out.println("Enter the number of days elapsed  since today: ");
        E_days = userInput.nextInt();

        int futureDay = (T_day + E_days) % 7;


        if (futureDay == 0) {
            System.out.println("Future Day is Sunday");
        } else if (futureDay == 1) {
            System.out.println("Future Day is Monday");
        } else if (futureDay == 2) {
            System.out.println("Today is Tuesday ");
        } else if (futureDay == 3) {
            System.out.println("Today is Wednesday");
        } else if (futureDay == 4) {
            System.out.println("Today is Thursday");
        } else if (futureDay == 5) {
            System.out.println("Today is Friday");
        } else if (futureDay == 6) {
            System.out.println("Today is Saturday");
        }

        //System.out.println("Today is " + T_day + " and the future day is " + E_days);
    }
}
