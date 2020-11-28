package bookcase.test_2;
import java.util.Random;
import java.util.ArrayList;

public class traning_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random seed = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            num = seed.nextInt(20);
            list.add(num);
        }
        randnum(list);

    }
    public static int randnum(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 == 0){
                list.remove(i);
            }
            else
                System.out.printf("%d\t",list.get(i));
        }
        return 0;
    }

}

