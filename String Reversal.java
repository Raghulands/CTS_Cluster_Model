import java.util.Scanner;

public class String Reversal
{
    public static void main(String args[])
    {
        String st="";
        String rev="";
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine();
        //System.out.println(st.length());
        for (int i=st.length()-1;i>=0;i--)
        {
            System.out.print(st.charAt(i));
        }
//        for (int i=st.length()-1;i>=0;i--)
//        {
//            rev=rev+st.charAt(i);
//        }
//        System.out.println(rev);

    }
}
