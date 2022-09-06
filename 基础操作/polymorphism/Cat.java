package Employe;

public class Cat extends Anmial{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColour()+"猫咪着眼睛侧着头吃鱼"+something+"东西");
    }

    public void catchMouse(){
        System.out.println("抓老师");
    }
}
