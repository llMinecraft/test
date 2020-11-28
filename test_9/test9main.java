package bookcase.test_9;

public class test9main {
    public static void main(String[] args) {
        computer pc = new computer();
        pc.open();
/*        mouse mouse = new mouse();*/
        usbdrive mouse = new mouse();
        pc.dirve(mouse);
        usbdrive keyboard = new keyboard();
        pc.dirve(keyboard);
        pc.close();


    }
}
