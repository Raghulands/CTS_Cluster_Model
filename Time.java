import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        if (time.length() != 5 || time.charAt(2) != ':') {
            System.out.println("INVALIDINPUT");
            return;
        }
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("INVALIDINPUT");
        } else if (hour < 12) {
            System.out.println("AM");
        } else {
            System.out.println("PM");
        }
    }
}
