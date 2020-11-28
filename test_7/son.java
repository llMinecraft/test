package bookcase.test_7;

public class son extends father{
    int age = 10;
    /*子类使用构造方法来调用父类构造方法！*/
    public son(){
        super();
    }
    public void show(){
        System.out.println("这是我作为儿子的特权!");
    }
}
