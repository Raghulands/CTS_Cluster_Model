import java.util.*;
public class TenthNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int length=num.length();
        System.out.println(num.charAt(length-2));
    }
}

