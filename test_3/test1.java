package bookcase.test_3;

public class test1 {
    public static void main(String[] args) {
        int[] num ={1,2,3};
        System.out.println(stringarray(num));

    }
    public static String stringarray(int[] num){
        String st1 ="[";
        for (int i = 0; i <num.length ; i++) {
            if(i==num.length-1){
                st1+="word"+num[i]+ "]";
            }
            else
                st1+="word" + num[i] +"#";
        }
        return st1;
    }
}
