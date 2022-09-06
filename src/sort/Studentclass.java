package sort;

import java.util.ArrayList;

public class Studentclass {
    private Studentclass(){

    }
    public static int Maxage(ArrayList<Stu> st){
        Stu s= new Stu();
        int max=st.get(0).getAge();
        for (int i = 0; i < st.size(); i++) {
            s=st.get(i);

           if(max>s.getAge()){

           }else {
               max=s.getAge();
           }


        }
        return max;

    }




}
