import java.util.Scanner;
public class hexadecimal_octal {
    public static void main(String[]args){
        String num=new String();
        Scanner in=new Scanner(System.in);
        num=in.nextLine();
        char[] nums=num.toCharArray();
        StringBuffer list=new StringBuffer();
        for(int i=0;i<nums.length;i++)
        {
            switch (nums[i])
            {
                case '0':
                    list.append("0000");
                    break;
                case '1':
                    list.append("0001");
                    break;
                case '2':
                    list.append("0010");
                    break;
                case '3':
                    list.append("0011");
                    break;
                case '4':
                    list.append("0100");
                    break;
                case '5':
                    list.append("0101");
                    break;
                case '6':
                    list.append("0110");
                    break;
                case '7':
                    list.append("0111");
                    break;
                case '8':
                    list.append("1000");
                    break;
                case '9':
                    list.append("1001");
                    break;
                case 'A':
                    list.append("1010");
                    break;
                case 'B':
                    list.append("1011");
                    break;
                case 'C':
                    list.append("1100");
                    break;
                case 'D':
                    list.append("1101");
                    break;
                case 'E':
                    list.append("1110");
                    break;
                case 'F':
                    list.append("1111");
                    break;
            }
        }
        if(list.length()%3==1)
            list.insert(0,"00");
        if(list.length()%3==2)
            list.insert(0,"0");
        StringBuffer list_2=new StringBuffer();
        for(int i=0;i<list.length();i=i+3)
        {
            if(list.subSequence(i,i+3).equals("000"))
            {
                list_2.append("0");
            }
            else if(list.subSequence(i,i+3).equals("001"))
            {
                list_2.append("1");
            }
            else if(list.subSequence(i,i+3).equals("010"))
            {
                list_2.append("2");
            }
            else if(list.subSequence(i,i+3).equals("011"))
            {
                list_2.append("3");
            }
            else if(list.subSequence(i,i+3).equals("100"))
            {
                list_2.append("4");
            }
            else if(list.subSequence(i,i+3).equals("101"))
            {
                list_2.append("5");
            }
            else if(list.subSequence(i,i+3).equals("110"))
            {
                list_2.append("6");
            }
            else if(list.subSequence(i,i+3).equals("111"))
            {
                list_2.append("7");
            }
        }
        if(list_2.subSequence(0,1).equals("0"))
            list_2.delete(0,1);

        System.out.println(list_2.toString());
    }
}
