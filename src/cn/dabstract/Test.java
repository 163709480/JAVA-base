package cn.dabstract;

public class Test {
    public static void main(String[] args) {

        Frog f= new Frog("小狗",1);
        System.out.println(f.getName()+","+f.getAge());
        f.drkin();
        f.eat();
    }
}
