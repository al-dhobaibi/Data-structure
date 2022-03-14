import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayStack<String> stack=new ArrayStack<>(5);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.print("Input Name: ");
            stack.push(input.next());
            System.out.println(" Top : "+stack.top()+"\t size : "+stack.size());
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"\t");
        }
    }
}
 // reverse an array using stack
// enter the array to stack then pop them again to the array !!