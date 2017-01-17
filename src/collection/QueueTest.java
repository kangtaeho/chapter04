package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("강태호");
		queue.offer("최원영");
		queue.offer("이영현");
		queue.offer("박강");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.poll());
		//비어있는경우 예외가 발생하지 않고 null을 리턴한다
	}

}
