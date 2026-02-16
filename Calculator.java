import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int result = 0;
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
        }
        System.out.println(result);
    }
}
