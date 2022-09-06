package Employe;

public class Dog  extends  Anmial{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColour()+"的狗两只前腿死死的抱住骨头猛吃吃"+something);
    }
    public void lookhome(){
        System.out.println("看家护院");

    }
}
