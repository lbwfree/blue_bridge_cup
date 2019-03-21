import java.util.Scanner;
public class palindrome_number_optimize {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int p=1;p<=9;p++)
            for(int q=0;q<=9;q++)
                for(int h=0;h<=9;h++){
                    if((p+q+h+p+q)==num)
                        System.out.println(p+""+q+""+h+""+q+""+p);
                }
        for(int p=1;p<=9;p++)
            for(int q=0;q<=9;q++)
                for(int h=0;h<=9;h++){
                    if((p+q+h+h+p+q)==num)
                        System.out.println(p+""+q+""+h+""+h+""+q+""+p);
                }




    }
}
