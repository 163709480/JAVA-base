package cn.dabstract;

public class Frog  extends Anmial{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙再吃虫子");
    }
}
