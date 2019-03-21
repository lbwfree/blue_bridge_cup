package test_3_21;

import java.util.Scanner;
public class Pascal {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] nums=new int[n][n];

        for(int i=0;i<n;i++)
        {
            nums[i][0]=1;
            nums[i][i]=1;
            for(int j=1;j<i;j++)
                nums[i][j]=nums[i-1][j-1]+nums[i-1][j];

        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j <=i; j++)
                System.out.print(nums[i][j]+" ");
            System.out.println();
        }
    }
}
