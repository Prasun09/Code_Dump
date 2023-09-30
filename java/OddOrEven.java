//using package so that user can give input
import java.util.Scanner;
class OddOrEven
{
    public static void main(String arg[])
    {
    //promote user for input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
        System.out.println(n +" Is Even");
        }else{
        System.out.println(n+" Is Odd");
        }
    }
}
