package bookcase.test_10;

public class MyTime {
    private int hour,minute,second;
    public MyTime(int hour,int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void addSecond(int sec){
        this.second+=sec;
    }
    public void addMinute(int min){
        this.minute+=min;
    }
    public void addHour(int hou){
        this.hour+=hou;
    }
    public void subSecond(int sec){
        this.second-=sec;
    }
    public void subMinute(int min){
        this.minute-=min;
    }
    public void subHour(int hou){
        this.hour-=hou;
    }
    public void diaplay(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
}
