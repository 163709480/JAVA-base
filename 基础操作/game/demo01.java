package game;

public class demo01 {
    public static void main(String[] args) {
        System.out.println(" game play");
        user us=new user("嚄",3239);



        user us2= new user("黛", 3239);

        while (true){
            us.attatch(us2);
            if(us2.getBold()==0){
                System.out.println("结束");
                break;
            }
        }


    }



}
