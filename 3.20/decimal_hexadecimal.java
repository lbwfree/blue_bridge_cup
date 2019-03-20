import java.util.LinkedList;
import java.util.Scanner;
public class decimal_hexadecimal {
    public static void main(String[] args){
        char[] num={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p;
        LinkedList k=new LinkedList();
      while(n>0){
          p=n%16;//余出16的位子上的数
          n=n/16;//减少一位进制
          k.addFirst(num[p]);//从后往前加位数
      }
        for (Object i:k) {
            System.out.print(i);
        }

    }

}
