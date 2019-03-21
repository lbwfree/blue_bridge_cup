package test_3_21;
import java.util.Scanner;
public class String_compare {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        if(arr1.length!=arr2.length)
            System.out.println(1);
        else{
            if(s1.equals(s2))
                System.out.println(2);
            else {
                if(s1.toLowerCase().equals(s2.toLowerCase()))
                    System.out.println(3);
                else
                    System.out.println(4);
            }
        }
    }
}
