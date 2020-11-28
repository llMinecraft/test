package bookcase.test_3;

public class string {
    public static void main(String[] args) {
        char[] array = {'a','b','c'};
        String st2 = "abc";
        int length = st2.length();
        String st1 = new String(array);
        int length2  = st1.length();
        System.out.println(st1.equals("abc"));
        System.out.println(length);
        System.out.println(length2);
        String str3 = "abc";
        System.out.println(str3);
        str3 = "bcd";
        System.out.println(str3);
    }
}
