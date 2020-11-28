package bookcase.test_11;
import java.util.Scanner;
class arithmetic{
    public double ar(double a,double b){
        return 0;
    }
}
class add extends arithmetic{
    public double ar(double a,double b){
        return a+b;
    }
}
class sub extends arithmetic{
    public double ar(double a,double b){
        return a-b;
    }
}
class mul extends arithmetic{
    public double ar(double a,double b){
        return a*b;
    }
}
class division extends arithmetic{
    public double ar(double a,double b){
        try{
            double number = a/b;
            return number;
        }catch(Exception e){
            System.out.println("出现的异常为:"+e.getMessage());
        }
        return -1;
    }
}
public class soft {
    public static void main(String [] args)throws Exception{
        double number=0;
        arithmetic add = new add();
        arithmetic sub = new sub();
        arithmetic mul = new mul();
        arithmetic division = new division();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入式子:");
        double a = sc.nextDouble();
        char  b =(char)System.in.read();
        double c = sc.nextDouble();
        if(b=='+') number = add.ar(a,c);
        else if(b == '-') number = sub.ar(a,c);
        else if(b == '*') number = mul.ar(a,c);
        if(b == '/') number = division.ar(a,c);
        System.out.println("运算结果为:"+number);
    }
}
