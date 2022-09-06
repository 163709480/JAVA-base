package cn.dabstract;

public abstract class Anmial {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Anmial() {
    }

    public Anmial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drkin(){
        System.out.println("动物在喝水");
    }
    public abstract void eat();







}
