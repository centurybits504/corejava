import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("B");
		//queue.add(null);/*Here NullPointerException */
		System.out.println("offer : "+queue.offer("D"));
		
		System.out.println("element : "+queue.element());
		
		System.out.println("peek : "+queue.peek());
		System.out.println("queue : "+queue);
	}
}
