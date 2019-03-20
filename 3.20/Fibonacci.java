import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int[] F=new int[1000000];
        F[1]=1;
        F[2]=1;
        for(int i=3;i<=m;i++){
            F[i]=(F[i-1]+F[i-2])%10007;
        }

        System.out.println(F[m]);
    }
}
