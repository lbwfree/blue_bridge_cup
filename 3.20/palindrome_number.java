import java.util.Scanner;
public class palindrome_number {
    static int n;
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String num=new String();
        n=in.nextInt();
        for(int i=10000;i<999999;i++)
        {
            num=((Integer)i).toString();
            if(palindrome(num))
                System.out.println(i);
        }
    }
    public static boolean palindrome(String num){
        char[] nums=num.toCharArray();
        int i=0;
        int j=0;
        for(i=0;i<nums.length/2;i++)
        {
            if(nums[i]!=nums[nums.length-1-i])
                return false;
            j=j+((Character)nums[i])-'0';
        }
        j=j*2;
        if(nums.length%2==1)
        {
            j=j+(nums[nums.length/2+1])-'0';
        }
       if(j==n)
           return true;
       return false;
    }
}
