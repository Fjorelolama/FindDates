import java.util.Scanner;

public class FindDatesWithHelp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = userInput.nextInt();
        System.out.println("Enter the elapsed day: ");
        int elapsed = userInput.nextInt();

        if (today == 0) {
            System.out.println("Today is Sunday");
        } if (today == 1) {
            System.out.println("Today is Monday");
        } if (today == 2) {
            System.out.println("Today is Tuesday ");
        } if (today == 3) {
            System.out.println("Today is Wednesday");
        } if (today == 4) {
            System.out.println("Today is Thursday");
        } if (today == 5) {
            System.out.println("Today is Friday");
        } if (today == 6) {
            System.out.println("Today is Saturday");
        }

        System.out.println("Today is " + today + " and the future day is " + elapsed);
    }
}
