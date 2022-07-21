package learning;

import java.util.Scanner;

public class base1 {
    public static void main(String[] args) {


        System.out.println("数字六");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        if(number==6&&number2==6){
            System.out.println(true);
        } else if (number%6==0&&number2%6==0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }





    }
}
