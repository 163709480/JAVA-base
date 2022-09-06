package sort;

public class Stu {
    private String name;

    public Stu(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private int age;
    private String sex;
    public static String teachName;

    public Stu() {
    }
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+sex+","+teachName);
    }


}
