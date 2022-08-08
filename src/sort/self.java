package sort;

public class self {
    public static void main(String[] args) {
        //添加一个对象，进行唯一性判断

        Student[] st = new Student[3];
        Student s1 = new Student("小张", 23, 3);
        Student s2 = new Student("小董", 24, 4);
        Student s3 = new Student("小爽", 93, 2234455);
        Student s4 = new Student("小222", 92223, 22334455);
        st[0] = s1;
        st[1] = s2;
        st[2] = s3;
       int i= genIndex(st,4);
        System.out.println(i);

        if(i>=0){
            System.out.println("存在");
        }else {
            System.out.println("删除失败");
        }
    }
    public static int genIndex(Student[] arr,int id ){
        for (int i = 0; i < arr.length; i++) {
            Student stu= arr[i];
            if(stu!=null){
                int sid=stu.getId();
                if(sid==id){
                    return i;
                }
            }
        }
        return -1;
    }

}
