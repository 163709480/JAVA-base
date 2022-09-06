package sort;

public class ArrayUtill {

    private ArrayUtill(){

    }
    //
    public static String print(int[] arr){

        StringBuilder str= new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str.append(arr[i]);
            }else {
                str.append(arr[i] ).append(",");
            }

        }
        str.append("]");
        return str.toString();
    }
    public static double getAerage(double[] ag){
        double sum=0;
        for (int i = 0; i < ag.length; i++) {
            sum+=ag[i];
        }
         return    sum/ ag.length;


    }
}
