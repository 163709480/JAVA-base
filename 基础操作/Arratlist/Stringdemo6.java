package sort;

import java.util.Scanner;

public class Stringdemo6 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int count=0;
        int numcount=0;
        int nnunt=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='a'&&c<='z'){
                nnunt++;
                //char类型的变量在参与计算的时候自动类型提升为int,查询ascii表

            } else if (c>='A'&& c <='Z') {
                numcount++;

            }else if (c>='0'&& c<='9'){
                count++;

            }
            System.out.println(c);

        }
        System.out.println("小写"+nnunt+"个"+"大写"+numcount+"数组字母"+count);
    }
}
