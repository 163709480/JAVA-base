package inherit;

public class Manger extends Employee  {

    @Override
    public void worker() {
        System.out.println("管理他人");
    }

    private int awarkdmon;

    public Manger() {
    }

    public Manger(String ID, String name, int price,int awarkdmon) {
        super(ID, name, price);
        this.awarkdmon=awarkdmon;
    }

    public int getAwarkdmon() {
        return awarkdmon;
    }

    public void setAwarkdmon(int awarkdmon) {
        this.awarkdmon = awarkdmon;
    }
}
