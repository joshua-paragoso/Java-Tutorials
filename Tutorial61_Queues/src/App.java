import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		/// queue of people
		// (head) <-00000000000000000000000000000000000<-(tail)
		// queue works FIFO, first in first out

		// queue with a maxium of 3 items
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// addign elements to queue
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of the queue " + q1.element());

		try {
//			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many elements in queue");
		}
		
		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}
		//removes head of the queue
		System.out.println("Removed from queue: "+ q1.remove());
		System.out.println("Removed from queue: "+ q1.remove());
		System.out.println("Removed from queue: "+ q1.remove());
		
		//removing from an empty queue will throw an exception
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many elements in queue");
		}
		
		////////////////////////////////////////////////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		
		//offers to queue
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		System.out.println("Head of queue: " + q2.peek());
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to add third");
		}
		for (Integer value : q2) {
			System.out.println("Queue 2 value: " + value);
		}
		
		//poll removes items
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}

}
