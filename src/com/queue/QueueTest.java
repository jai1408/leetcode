package com.queue;

// Driver class
public class QueueTest {
	
	//private static final Logger logger = LoggerFactory.getLogger(QueueTest.class);
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		System.out.println(queue.dequeue() + " dequeued from queue\n");
		//logger.info("dequeued from queue\\n = {}",queue.dequeue());
		
		
		queue.enqueue(60);

		System.out.println("Front item is " + queue.front());
		//logger.info("Front item is {}",queue.front());

		System.out.println("Rear item is " + queue.rear());
		//logger.info("Rear item is = {}", queue.rear());
	}
}