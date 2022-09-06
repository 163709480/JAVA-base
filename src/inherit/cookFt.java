package inherit;

public class cookFt extends Employee{
    public cookFt() {
    }

    public cookFt(String ID, String name, int price) {
        super(ID, name, price);
    }

    @Override
    public void worker() {

        System.out.println("炒菜");
    }
}
