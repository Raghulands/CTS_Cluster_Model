import java.util.*;
public class DiagonalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int L = s.length();
        for (int i = 0; i < L; i++)
        {
            for (int j = 0; j < L; j++)
            {
                if (j == i) {
                    System.out.print(s.charAt(i));
                }
                else if (j == L - 1 - i) {
                    System.out.print(s.charAt(L - 1 - i));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
