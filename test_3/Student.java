package bookcase.test_3;

public class Student {
    private int age;
    private String name;
    private static int studentid = 0;
    private int id = 0;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++studentid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

