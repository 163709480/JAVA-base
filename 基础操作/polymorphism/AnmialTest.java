package Employe;

public class AnmialTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.setAge(8);
        d.setColour("红色");
        Cat c= new Cat();
        c.setAge(2);
        c.setColour("蓝色");
        Personal p= new Personal();
        p.setName("张大大");
        p.setAge(45);



        d.eat("骨头");
        p.keept(d,"gou");



    }

    public void eat(Personal sa,Anmial an){

        System.out.println("年龄为"+sa.getAge()+"的"+sa.getName()+"养了一只"+an.getAge()+"岁");

    }
}
