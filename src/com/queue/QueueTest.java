package com.queue;

class Queue {
	int front, rear, size;
	int capacity;
	int array[];

	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];

	}

	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return (queue.size == 0);
	}

	void enqueue(int item) {
		if (isFull(this)) {
			System.out.println("queue is full. can't enqueue "+item);
			return;
		}
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue() {
		if (isEmpty(this)) {
			System.out.println("queue is empty.");
			return Integer.MIN_VALUE;
		}
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	// Method to get front of queue
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	// Method to get rear of queue
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}
}

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