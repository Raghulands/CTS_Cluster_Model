import java.util.Scanner;
public class q55
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        //System.out.println(arr.length);
        //reverse
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
