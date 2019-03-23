package test_3_23;
import java.util.Scanner;
import java.text.DecimalFormat;
public class area_square {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[][] arr=new int[2][4];//定义两行四个数
        for(int i=0;i<2;i++)
            for(int j=0;j<4;j++)
                arr[i][j]=in.nextInt();
        float a,b;//定义相交矩形长宽

        //只相交的话是各个边的长度减去最大边就是四个数最大数和最小数之间的长度
        //等负数为不相交
        a=Math.abs(arr[0][0]-arr[0][2])+Math.abs(arr[1][0]-arr[1][2])-
                Math.abs(MAX(arr[0][0],arr[0][2],arr[1][0],arr[1][2])-
                        MIN(arr[0][0],arr[0][2],arr[1][0],arr[1][2]));
        b=Math.abs(arr[0][1]-arr[0][3])+Math.abs(arr[1][1]-arr[1][3])-
                Math.abs(MAX(arr[0][1],arr[0][3],arr[1][1],arr[1][3])-
                        MIN(arr[0][1],arr[0][3],arr[1][1],arr[1][3]));
        if(a*b>0)//如果a*b不大于0说明a或b至少一个边不想交等于0只是边重和
        {
            DecimalFormat df=new DecimalFormat("#.00");//输出格式小数点二位
            System.out.println(df.format(a*b));
        }
        else{
            System.out.println("矩形面积不存在");
        }
    }
    private static  int MAX(int a,int b,int c,int d){
        if(a<b)
            a=b;
        if(a<c)
            a=c;
        if(a<d)
            a=d;
        return a;

    }
    private static  int MIN(int a,int b,int c,int d){
        if(a>b)
            a=b;
        if(a>c)
            a=c;
        if(a>d)
            a=d;
        return a;
    }

}
