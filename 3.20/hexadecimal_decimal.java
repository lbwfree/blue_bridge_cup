import java.util.Scanner;
public class hexadecimal_decimal {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String L=in.nextLine();
        char[] Len=L.toCharArray();
        int P;
        int lenght=Len.length-1;
        double num=0;
        for(int i=0;i<Len.length;i++)
        {
            if(Len[i]=='A')
                num=num+10*(Math.pow(16,lenght-i));
            else  if(Len[i]=='B')
                num=num+11*(Math.pow(16,lenght-i));
            else  if(Len[i]=='C')
                num=num+12*(Math.pow(16,lenght-i));
            else  if(Len[i]=='D')
                num=num+13*(Math.pow(16,lenght-i));
            else  if(Len[i]=='E')
                num=num+14*(Math.pow(16,lenght-i));
            else  if(Len[i]=='F')
                num=num+15*(Math.pow(16,lenght-i));
            else{
                P=((Character)Len[i]).charValue();
                num=num+P*(Math.pow(16,lenght-i));
            }
        }
        System.out.println((int)num);
    }
}
