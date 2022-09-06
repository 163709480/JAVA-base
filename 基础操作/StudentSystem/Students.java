package sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("---欢迎来到学生管理系统----");

        boolean flag = true;
        Scanner sc = new Scanner(System.in);

//      ID唯一
        loop:
        while (flag) {
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> uqueryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    flag = false;
                }
                default -> System.out.println("没有这个选项");

            }


        }
    }


    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //利用空参数构造
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        boolean flag = contains(list, id);
        if(flag){
                s.setId(id);
                System.out.println("请输入姓名");
                String name = sc.next();
                s.setName(name);
                System.out.println("请输入年龄");
                int age = sc.nextInt();
                s.setAge(age);
                System.out.println("请输入地址");
                String address = sc.next();
                s.setAddress(address);



                list.add(s);
                System.out.println("添加成功");
            }else {
                System.out.println("id重复");
            }


        }

        public static void deleteStudent (ArrayList<Student> list) {
        Scanner sc= new Scanner(System.in);
            System.out.println("请输入删除ID");
            String id=sc.next();

            boolean de = contains(list, id);
            if(de){
                System.out.println("id不存在");
            }else {
                System.out.println("id存在");

                int id1 = getId(list, id);
                if (id1 >= 0) {

//                    if(id==s.getId()){
                    list.remove(id1);
                    System.out.println("删除");
                }

//                    }

                
            }
           


        }
        public static void updateStudent (ArrayList < Student > list) {
            System.out.println("修改学生");
            Scanner sc= new Scanner(System.in);
            String s2c = sc.next();
            int flag =getId(list, s2c);
            if(flag==-1){
                System.out.println("id++不存在");
                return;

            }else {
                System.out.println("id存在");
                Student stu = list.get(flag);
                System.out.println("请输入学生姓名");
                String newname = sc.next();
                stu.setName(newname);
                System.out.println("请输入学生年龄");
                int newnext = sc.nextInt();
                stu.setAge(newnext);
                System.out.println("请输入学生地址");
                String address=sc.next();
                stu.setAddress(address);
                System.out.println("学生信息修改成功");


            }

        }
        public static void uqueryStudent (ArrayList < Student > list) {
            System.out.println("查询学生");
            if (list.size() == 0) {
                System.out.println("当前无学生信息，请添加后再查询");
            } else {
                System.out.println("id    姓名    年龄     家庭住址");
                for (int i = 0; i < list.size(); i++) {
                    Student qu = list.get(i);
                    System.out.println(qu.getId() + "    " + qu.getName() + "    " + qu.getAge() + "     " + qu.getAddress());

                }
            }
            return;
        }
        public static boolean contains(ArrayList < Student > list,String id){

            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                String id1 = stu.getId();
                if(id1.equals(id)){
                    return false;
                }


            }
            return true;
        }
        public static int getId(ArrayList < Student > list, String id){
            for (int i = 0; i < list.size(); i++) {
                Student st= list.get(i);

                String sid= st.getId();
                if(sid.equals(id)){
                    //equals方法判断与id值是否相等
                    //==比较的是变量(栈)内存中存放的对象(堆)内存地址，用来判断两个对象的地址是否相同
                    //equals用来比较的是两个对象的内容是否相等
                    System.out.println("st.getid"+st.getId());
                    //if(st.getid==id)
                    return i;

                }
                
            }
            return -1;
        }
    }




