package learning;

public class girl {
   private String name;
   private int age=3;
   private String gender;

    public girl(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public girl(){
       System.out.println("空参");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void method(){
        int age=2;
        System.out.println(this.age);

    }


}
