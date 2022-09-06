package Employe;

public class Personal {
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

    public Personal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Personal() {
    }
    public void keept(Anmial anm,String something){
        System.out.println("年龄为"+getAge()+getName()+"喂养一只"+anm.getAge()+anm.getColour()+"颜色的狗");
    }
}
