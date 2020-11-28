package bookcase.test_10;

public class Vehicle {
    int speed;
    float size;
    String name;
    public void move(){}
    public Vehicle(int speed,float size,String name){
        this.speed = speed;
        this.size = size;
        this.name = name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int speedUp(int a){
        this.speed+=a;
        return this.speed;
    }
    public int speedDown(int a){
        this.speed-=a;
        return this.speed;
    }

}
