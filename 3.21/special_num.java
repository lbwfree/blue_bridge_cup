package test_3_21;

public class special_num {
    public static void main(String[] args){
        for(int i=1;i<=9;i++)
            for(int j=0;j<=9;j++)
                for(int k=0;k<=9;k++)
                    if((i*i*i+j*j*j+k*k*k)==i*100+j*10+k)
                        System.out.println(i*100+j*10+k);
    }
}
