package test_3_21;

import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        int[] arr=new int[10000];
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        int temp=1;
        boolean t=true;
        arr[0]=2;
        for(int i=2;i<=b;i++)
        {
            for(int j=0;j<temp;j++)
            {
                t=true;
                if(i%arr[j]==0) {
                    t=false;
                    break;
                }
            }//只有质数对前面所有的质数取模都不为0；
            if(t)
            {
                arr[temp]=i;
                temp++;
            }//来找从2开始寻质数
            if(i==a){//此时从输入的a开始对a分解此时a==i
                int aa=a;
                System.out.print(aa+"=");
                for(int j=0;j<temp;j++)
                {
                    if(aa%arr[j]==0)
                    {
                        aa=aa/arr[j];
                        if(aa!=1){
                            System.out.print(arr[j]+"*");
                            j--;
                        }
                        else {
                            System.out.print(arr[j]);
                        }
                    }
                }
            }
            a++;//与i同步
            System.out.println();//换行
        }
    }
}
