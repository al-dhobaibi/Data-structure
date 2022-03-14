import java.util.Arrays;

public class ReverseArrayUsingSatck {
    public static void main(String[] args) {
        int [] array={11,12,13,14,15};
        ArrayStack<Integer> s=new ArrayStack<>();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                s.push(array[i]);
            }
            System.out.println("After reverse ");
            System.out.println(Arrays.toString(array));
        }


    }

}
