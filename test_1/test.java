package bookcase.test_1;
import bookcase.test_1.object;

import java.util.ArrayList;


public class test {
    public static void main(String[] arg){
        ArrayList<String> list = new ArrayList<>();
        object[] array = new object[3];
        object one = new object("影流之主",16);
        object two = new object("诡术妖姬",18);
        object three = new object("疾风剑豪",12);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        list.add("艾欧尼亚");
        list.add("德玛西亚");
        System.out.println(list);
        System.out.println(one.getName());


    }

}
