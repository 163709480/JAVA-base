package inherit;

public class Employee {
    private String ID;
    private String name;
    private int price;

    public Employee() {
    }

    public Employee(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void worker(){

    }
    public void eat(){
        System.out.println("吃米饭");
    }


}
