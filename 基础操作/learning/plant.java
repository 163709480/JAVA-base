package learning;

import java.util.Scanner;

import static java.lang.System.*;

public class plant {
    public static void main(String[] args) {
        out.println("请输入机票原价，月份和头等舱或经济舱   1代表头等舱  2代表经济舱");
        Scanner sc=new Scanner(in);
        double money=sc.nextInt();
        int moy=sc.nextInt();
        int mode = sc.nextInt();
        out.println(mode);
       double c= compelete(money,moy,mode);
        out.println("打折机票"+c);


    }
    public static double compelete(double money, int moy, int mode){

        switch (moy){

            case 5,6,7,8,9,10 -> {
                out.println("旺季");
                if(mode==1){
                    money=  (money*0.9);
                }else if (mode==2){
                    money=  (money*0.85);
                }
                break;
            }

            case 1,2,3,4,11,12 -> {
                out.println("淡季");
                if(mode==1){
                    money=money*0.7;
                }else if(mode==2) {
                    money =money*0.65;
                }break;
            }

        }
        return money;



    }
//    public static  int come(String mode){
//        if(mode=="经济舱"){
//
//        } else if (mode=="头等舱") {
//
//        }
//    }
}
