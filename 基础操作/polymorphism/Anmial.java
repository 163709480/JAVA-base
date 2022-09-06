package Employe;

public class Anmial {
    private String colour;
    private int  age;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Anmial(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public Anmial() {
    }

    public void eat(String something ){
        System.out.println("吃东西");
    }
}
