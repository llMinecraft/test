package bookcase.test_9;

public class keyboard implements usbdrive {
    public void open(){
        System.out.println("插上键盘!");
    }
    public void close(){
        System.out.println("断开键盘!");
    }
    public void type(){
        System.out.println("进行文字输入!");
    }
}
