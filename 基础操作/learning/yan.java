package learning;

import java.util.Arrays;
import java.util.Random;

public class yan {
    public static void main(String[] args) {
//       char[]  chs= new char[52];
//        for (int i = 0; i < chs.length; i++) {
//            if(i<=25){
//                chs[i]=(char)(97+i);
//            }else {
//                //添加大写字母
//                chs[i]=(char)(65+i-26);
//            }
//
//        }
//
//        //随机抽取数组
//        char[] ac= new char[5];
//        Random r =new Random();
//
//        String result ="";
//
//
//
//        for (int i = 0; i < 4; i++) {
//            int coun=r.nextInt(52);
//             ac[i]= (chs[coun]);
//
//
//            result=result+ac[i];
//
//
//        }
//        result=result+r.nextInt(9);
//        System.out.println(result);
        ma.code();

    }
}
class ma{
    public static void code(){
        int[] user=new int[7];
        Random rc= new Random();
        for (int i = 1; i <= 6; i++) {
            user[i]=rc.nextInt(100);
            System.out.println(user[i]);

        }
        for (int i = 0; i < user.length; i++) {
            if(user[i]<user[0]){

            }

        }
        System.out.println(Arrays.stream(user).max());

    }
}

