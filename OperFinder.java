import java.util.*;
public class OperFinder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] parts = ip.split("=");
        String left = parts[0];
        int C = Integer.parseInt(parts[1]);
        int A = 0, B = 0;
        char oper = ' ';
        for(int i = 0; i < left.length(); i++)
        {
            char ch = left.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                A = Integer.parseInt(left.substring(0, i));
                B = Integer.parseInt(left.substring(i + 1));
                oper = ch;
                break;
            }
        }
        if(A + B == C)
            System.out.println("+");
        else if(A - B == C)
            System.out.println("-");
        else if(A * B == C)
            System.out.println("*");
        else if(A / B == C)
            System.out.println("/");
    }
}
