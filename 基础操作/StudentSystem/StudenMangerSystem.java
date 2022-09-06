package sort;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenMangerSystem {

    public static void main(String[] args) {

        ArrayList<Student> list= new ArrayList<>();
        System.out.println("------欢迎来到学生管理系统-----");
        ArrayList<Student> students = addSt(list);
        inquiry(students);
        delete(students,"001");
        System.out.println("===================");
        inquiry(students);


    }

    public static ArrayList<Student>  addSt(ArrayList<Student> list){
        Scanner sc= new Scanner(System.in);
        System.out.println("请问要输入几个学生的信息");

//        for(int i=0;i< sc.nextInt();i++){

            Student st=new Student(sc.next(),sc.next(),sc.next());
            list.add(st);


//        }

        return list;

    }
    public static ArrayList<Student> delete(ArrayList<Student> list,String id){


        for (int i = 0; i < list.size(); i++) {
            
            Student st=list.get(i);
            if(id==st.getId()){
                System.out.println("id存在");
                list.remove(i);

            }



        }
        return list;

    }


    public static void inquiry(ArrayList<Student> list){

        ArrayList<Student> s = list;
        if(s.size()==0){
            System.out.println("当前没有学生信息");
        }
        for (int i = 0; i < s.size(); i++) {

            Student st=s.get(i);
            System.out.println("id    姓名     年龄         家庭住址");
            System.out.println(st.getId()+"    "+st.getName()+"     "+st.getAge()+"         "+st.getAddress());
        }

    }


}
