import java.util.Stack;

public class R_6_5 {
    public static Stack <Integer>popAllRecursive(Stack stack) {

        if(stack.isEmpty()) {

            return null;
        }
        stack.pop();

        popAllRecursive(stack);

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        System.out.println("Stack before popped:"+stack);
        System.out.println("Stack elements are popped:"+popAllRecursive(stack));

    }
}
