package test_3_23;
import java.util.Scanner;
public class Palindrome_string {
    private static int T=0;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a;//回文串的长度
        a=input.nextInt();
       input.nextLine();
        String s=input.nextLine();
        char[] arr=s.toCharArray();
        Change(arr,a);
    }
    private static void Change(char[] arr,int n){
        int flag=0;//标记查询的字符
        for(int i=0;i<n;i++) {
            for (int j = n-1; j >= i; j--) {
                 if(arr[j]==arr[i]){
                    for(int l=j;l<n-1;l++)
                    {
                        char num;
                        num=arr[l];
                        arr[l]=arr[l+1];
                        arr[l+1]=num;
                        T++;
                    }
                    n--;
                    break;
                }
            }
        }
        System.out.println(T);
    }

}
