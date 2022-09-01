package sort;

import java.util.Scanner;

public class st {
    public static void main(String[] args) {
//        String s1="2222";
//        String s3= new String("2");
//        char[] chs={'a','v'};
//        String s4= new String(chs);
//        System.out.println(s4);
//
//        //传递字节数组
//        //bute
//        byte[] btyte={22,33,44,5};
//        String s5= new String(btyte);
//        System.out.println(s5);
//        //键盘录入一个字符串
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);

        }

    }


}
