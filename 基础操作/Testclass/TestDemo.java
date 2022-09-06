package sort;


public class TestDemo {
    public static void main(String[] args) {
        int[] arr1={1,3,4,5,6,7};
        String str = ArrayUtill.print(arr1);
        System.out.println(str);
        double[] arr2={1.3,2.4,2.4,9.3};
        double avg = ArrayUtill.getAerage(arr2);
        System.out.println(avg);

    }

}
