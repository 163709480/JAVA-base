package inherit;

public class Test {
    public static void main(String[] args) {
        Manger m = new Manger("heima","dddd",2323,22);
        m.worker();
        m.eat();

        cookFt co= new cookFt("2222","work",99);
        co.eat();
        co.worker();
    }


}
