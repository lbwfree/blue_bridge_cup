package test_3_21;

import java.util.Scanner;
public class sort_2 {
    static int[] nums;
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        sort(nums);
        for(int i:nums)
            System.out.print(i+" ");
    }
    public static void sort(int[] num){
        int temp;
        for(int i=0;i<num.length-1;i++)
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }




    }
}
