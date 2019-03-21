package test_3_21;
import java.util.Arrays;;
import java.util.Scanner;
public class sort_1 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        Arrays.sort(nums);
        for(int i:nums)
            System.out.print(i+" ");


    }
}
