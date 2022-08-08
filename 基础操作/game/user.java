package game;

import java.util.Random;

public class user {

      private   String name;
     private    int bold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user(String name, int bold) {
    }

    public int getBold() {
        return bold;
    }

    public void setBold(int bold) {
        this.bold = bold;
    }

    public  void attatch(user game){
        Random ro= new Random();
        int numb=0;


           int hurt= ro.nextInt(20);

           numb=this.getBold()-hurt;
          this.setBold(numb);
           System.out.println(this.getName()+"打了"+game.getName());
           System.out.println("造成了"+hurt+"伤害"+this.getName()+"还剩"+this.getBold()+"血");


    }
}
