package stackTut;

import java.util.Stack;

public class DeleteMidOfAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        DeleteMidOfAStack solution = new DeleteMidOfAStack();
        solution.deleteMid(stack, stack.size());
        System.out.println(stack);
    }
//    private void deleteMid(Stack<Integer> stack, int size) {
//        if (stack.isEmpty() || size <= 0) {
//            return;
//        }
//        deleteMidUtil(stack,size,0);
//    }
//    private void deleteMidUtil(Stack<Integer> s, int sizeOfStack, int currentIndex) {
//        if (currentIndex == sizeOfStack / 2) {
//            // Remove the middle element
//            s.pop();
//            return;
//        }
//        // Remove the top element
//        int top = s.pop();
//        // Recursive call
//        deleteMidUtil(s, sizeOfStack, currentIndex + 1);
//        // Push the removed elements back
//        s.push(top);
//    }


    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int size) {
        if (size <= 1) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size / 2; i++) {
            stack.push(s.pop());
        }
        s.pop();
        for (int i = 0; i < size / 2; i++) {
            s.push(stack.pop());
        }
    }
    
}
