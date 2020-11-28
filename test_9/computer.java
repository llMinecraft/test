package bookcase.test_9;

public class computer {
    public void open (){
        System.out.println("打开电脑!");
    }
    public void close(){
        System.out.println("关闭电脑！");
    }
    public void dirve(usbdrive usb){
        usb.open();
        if(usb instanceof mouse){
            mouse mouse = (mouse) usb;
            mouse.click();
//            这里的usb是 new keyboard/mouse 的对象即( 父类 usb = new keyboard / mouse；)
        }else if (usb instanceof keyboard){
            keyboard keyboard = (keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
