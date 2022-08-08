package crass;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        girls [] ar= new girls[4];
        Random ro= new Random();

        girls g1= new girls("张",23,"女","tv==__+");
        girls g2= new girls("爽",3,"女男","tv--");
        girls g3= new girls("爽",2,"女女","tv-_-");
        girls g4= new girls("大",20,"女男","tv-=");

        ar[0]=g1;
        ar[1]=g2;
        ar[2]=g3;
        ar[3]=g4;
        int sum=0;
        int average=0;
        for (int i = 0; i < ar.length; i++) {
            girls io=ar[i];
            sum=io.getAge()+sum;


        }

       average= sum/ar.length;
        System.out.println("平均值为"+average);
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i].getAge()<average){
                System.out.println("姓名"+ar[i].getName()+"    "+"年龄"+ar[i].getAge()+ar[i].getGender()+ar[i].getHobby());
                count++;
            }

        }
        System.out.println("有"+count+"个人年龄比平均值低");























    }
}
