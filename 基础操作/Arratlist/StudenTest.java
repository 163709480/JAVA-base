package sort;

public class StudenTest {
    public static void main(String[] args) {
        Student[] stu=new Student[3];


        Student g1= new Student("小名",22,22233707);
        Student g2= new Student("小爽",29,370782);
//        Student g3= new Student("小董",92,44790032);
        stu[0]=g1;
        stu[1]=g2;
//        stu[2]=g3;
        Student stu4= new Student("小六",9,132116);

       boolean flag= contains(stu, stu4.getId());//参数1为stu数组 参数2 为id值
       if(flag){
           System.out.println("重复");
       }else {

           int count=getCount(stu);
           if(count==stu.length){
               System.out.println("已经存慢");
           Student[] newArr= newCount(stu);
            newArr[count]=stu4;
               printArr(newArr);
           }else {
            stu[count]=stu4;
               printArr(stu);
           }
       }

        }
        public static Student[] newCount(Student[] arr ){
        Student[] newArr= new Student[arr.length+1];

        //循环便利得到老数组中的每一个元素
            for (int i = 0; i < arr.length; i++) {
                //把老数组中元素添加到新数组中
                newArr[i]=arr[i];
            }
            return newArr;
        }



        public  static int getCount(Student[] arr){ //判断有几个地方不是null
            int count=0;
            for (int i = 0; i < arr.length; i++) {

                if(arr[i]!=null){
                count++;
                }

            }
            return count;

        }



    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu !=null){
                int sid=stu.getId();
                if(sid==id){

                    return true;
                }
            }




        }
        return false;

    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student st=arr[i];
            if(st!=null){
                System.out.println(st.getId()+","+st.getName()+","+st.getAge());
            }

        }

    }

    }



