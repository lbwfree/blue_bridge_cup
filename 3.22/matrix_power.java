package test_3_21;
import java.util.Scanner;
public class matrix_power {
    static int i=0;
    static int[][] arr_2;//储存数组
    public static void main(String[] args) {
        int a;
        int b;//输入a为a阶函数，b为b次幂
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        int[][] arr=new int[a][a];
        arr_2=new int[a][a];
        for (int i=0;i<a;i++)
            for(int j=0;j<a;j++) {
                arr[i][j] = in.nextInt();
                arr_2[i][j] = arr[i][j];//用来防止一次幂
            }
        if(b==0)//判断是不是零次幂
        {
            for (int i=0;i<a;i++)
                for(int j=0;j<a;j++)
                    System.out.println("1"+" ");
             return;
           }
         matrix(arr,arr,b-1,a);//传输数组，次幂，和次方数
        for (int i=0;i<a;i++) {
            for (int j = 0; j<a; j++)
                System.out.print(arr_2[i][j]+" ");
            System.out.println();
        }
    }
    public static void matrix(int[][] arr,int[][] arr_1 ,int b,int a)//b代表要循环的结果
    {
        if(b==0)
            return;
        for (int i=0;i<a;i++)//清空储存数组
            for(int j=0;j<a;j++)
                arr_2[i][j]=0;
        for(int i=0;i<a;i++)//矩阵乘法
            for(int j=0;j<a;j++)
                for(int k=0;k<a;k++)
                     arr_2[i][j]+=arr[i][k]*arr_1[k][j];
        matrix(arr_2,arr_1,b-1,a);
    }

}
