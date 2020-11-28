package bookcase.test_3;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = str.next();
        int countupper = 0;
        int countlower = 0;
        int countnum =0 ;
        int countother = 0 ;
        char[] str2 = str1.toCharArray();
        for (int i = 0; i <str2.length ; i++) {
            if(str2[i]>='A'&&str2[i]<='Z')
                countupper++;
            else if(str2[i]>='a'&&str2[i]<='z')
                countlower++;
            else if(str2[i]>='0' &&str2[i]<='9')
                countnum++;
            else
                countother++;
        }
        System.out.println("大写字母有"+countupper+"个");
        System.out.println("小写字母有"+countlower+"个");
        System.out.println("数字有"+countnum+"个");
        System.out.println("其他字符有"+countother+"个");
    }
}
