package sort;

import java.util.ArrayList;

public class ARR2 {
    public static void main(String[] args) {
         ArrayList<username> list = new ArrayList<>();
         //创建一个Arraylist集合 类型为 username对象
            username u1 = new username("001","1370","root");
        username u2 = new username("002","639","worrrrrd");
        username u3 = new username("003","12330","zoneeeee");
        //创建对象
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //向list集合存入对象数据
        int flag = check(list, "003");
        if(flag!=-1){
            System.out.println("找到了");
        }




    }
    public  static   int check( ArrayList<username> list,String  id){
        //传入参数需为要查找的集合 和所查的id数据
        for (int i = 0; i < list.size(); i++) {
           username u=list.get(i);
           String uid= u.getId();
           if(uid.equals(id)){
               return i;
           }

        }

        return -1;




    }
}
