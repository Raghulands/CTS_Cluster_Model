import java.util.Scanner;
public class Prime Check
{
    public static void main(String args [])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter");
       int num= sc.nextInt();
       if(num>1)
       {
           for (int i=2;i<=num;i++)
           {
               if (num%i==0)
               {
                   System.out.println("Prime");
               }
           }
       }
       else{
           System.out.println("NonPrime");
       }
    }
}
