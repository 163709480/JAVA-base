package sort;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1= new Phone("小米",1000);
        Phone p2= new Phone("苹果",800);
        Phone p3= new Phone("锤子",29999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> ret = ret(list);
        for (int i = 0; i < ret.size(); i++) {
            Phone ph= ret.get(i);
            System.out.println(ph.getBoard()+","+ph.getPrice());
            
        }
        


        //返回多个数据，可以把这些数据放到一个容器当中
    } public  static ArrayList<Phone> ret (ArrayList<Phone>  ph){
        ArrayList<Phone> result= new ArrayList<>();
        for (int i = 0; i < ph.size(); i++) {

                Phone p= ph.get(i);
                int price=p.getPrice();
                if(price<3000){
                    result.add(p);
                }


            
        }
        return result;


    }



}
