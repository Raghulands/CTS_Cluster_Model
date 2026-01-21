import java.util.Scanner;
public class q56
{
    public static void main(String args[])
    {
        int first=0;
        int second=1;
        int trushold;
        int temp = 0;
        Scanner sc=new Scanner(System.in);
        trushold= sc.nextInt();
        for (int i=2;i<=trushold;i++) //i=2(as the 1st&2nd are declared)
        {
            temp=first+second;
            first=second;
            second=temp;
        }
        System.out.println(temp);

    }
}
