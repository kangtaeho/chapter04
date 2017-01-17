package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("강태호");
		stack.push("최원영");
		stack.push("이영현");
		stack.push("박강");
		
		System.out.println(stack.isEmpty()+"\n");
		System.out.println(stack.pop());
		System.out.println(stack.pop()+"\n");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()+"\n");
		
		//stack.pop()// 비어있는 경우 예외발생
		

	}

}
