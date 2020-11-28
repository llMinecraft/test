package bookcase.test_10;

public class Student{
    String xm,xh,xb;
    public Student(String xm,String xh,String xb){
        this.xm = xm;
        this.xh = xh;
        this.xb = xb;
    }
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }
    public void show(){
        System.out.println("学号:"+this.xh+'\t'+"姓名:"+this.xm+'\t'+"性别:"+this.xb+'\t');
    }
}