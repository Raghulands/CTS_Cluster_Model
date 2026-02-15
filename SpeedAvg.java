import java.util.*;
public class SpeedAvg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] parts = ip.split(" ");
        String left = parts[0];
        String right = parts[1];
        String[] lp = left.split("@");
        double l1 = Double.parseDouble(lp[0]);
        double l2 = Double.parseDouble(lp[1]);
        String[] rp = right.split("@");
        double r1 = Double.parseDouble(rp[0]);
        double r2 = Double.parseDouble(rp[1]);
        double avg1 = l1 + r1;
        double avg2 = l2 + r2;
        double avg = avg1 / avg2;
        System.out.printf("%.2f kmph", avg);
    }
}
