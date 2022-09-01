package sort;

import java.util.ArrayList;

public class Renam {
    public static void main(String[] args) {
//        int[] arr= new int[0];
////        ArrayList<String> list= new ArrayList<String>(); jdk7以前
//        ArrayList <String> list= new ArrayList<>();
//        //打印对象不是地址值，而是集合中存储数据内容
//        //在展示的时候会拿[]把所有的数据进行包裹
//
//       list.add("aaaa");
////        System.out.println(list);
//        list.remove(0);
////        System.out.println(list);









//        ArrayList <String> li=new ArrayList<>();
//        li.add("aaa");
//        li.add("bbb");
//        li.add("ccc");  //增
//        System.out.println(li);
//        li.remove("aaa");
//        li.remove(0);   //删
//        li.set(0,"xiugai"); //改
//        System.out.println(li);
//        list.add("222222222222223333333333");
//        for (int i = 0; i < li.size(); i++) {       //查询
//           li.get(i);
//
//        }

        ArrayList<Integer> st = new ArrayList<>();
        st.add(3);
        st.add(5);
        st.add(55);
        st.add(34);
        System.out.println("[");
        for (int i = 0; i < st.size(); i++) {
            if(i==st.size()-1){
                System.out.print(st.get(i));
            }else {
                System.out.print(st.get(i)+",");
            }

        }
        System.out.println("]");





    }
}
 