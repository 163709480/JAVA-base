package learning;

public class pub {
    public static void main(String[] args) {
//
//        int one=getARR(4,5);
//        int two=getARR(1,4);
//    if(one>two){
//        System.out.println("one大");
//
//    }else {
//        System.out.println("two大");
//    }

        int[] arge={1,29099,30,48,59,3,4,5,6,6,};
        int [] ar=copyOfRange(arge,4,5);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

//        System.out.println(getArr(arge,3));





    }

//    public static int getArr(int[] arr,int number){
//        int max=0;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]==number){
//                System.out.println(arr[i]+"存在");
//                max=arr[i];
//                break;
//            }
//
//
//        }
//        return max;
    public static int[] copyOfRange(int[] arr, int from, int to){
        int []argg=new int[10];
        for (int i = from; i < to; i++) {
            argg[i]=arr[i];

        }
        return argg;




    }


}




