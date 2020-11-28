package bookcase.test_10;

public class TestMyPoint {
    public static void main(String[] args) {
        //依次输入姓名，学号，性别
        Student st = new Student("小明","19064101","男");
        st.show();
        Vehicle bus = new Vehicle(10,250,"公共汽车");
        System.out.println("交通工具:"+bus.name+"移动速度:"+bus.speed);
        bus.speedUp(10);
        System.out.println("交通工具:"+bus.name+"移动速度:"+bus.speed);
        MyTime s = new MyTime(12,45,22);
        s.diaplay();
    }
}
