import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[]x={4,5,6,7,8};
        System.out.println(Arrays.toString(reverArray(x)));
    }
    public static int[] reverArray(int [] d){
        int n= d.length-1;
        int [] arr2= new int[d.length];
        for (int i =0; i<d.length; i++) {
            arr2[i]=d[n];
            n--;
        }
        for (int i = 0; i < d.length ; i++) {
            d[i]=arr2[i];
        }
        return d;
    }
}
