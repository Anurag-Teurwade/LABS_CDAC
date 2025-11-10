package queue;

public class QueueArray {

	private int size;
	private int[] queue;
	private int front;
	private int rear;

//	QueueArray() {
//		size = 0;
//		queue = null;
//		front = rear = -1;
//	}

	public void initQueue(int size) {
		this.size = size;
		queue = new int[this.size];
		front = rear = -1;
	}

	public boolean isFull() {

		return (rear == size - 1);
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public void enQueue(int data) {

		if (!isFull()) {
			queue[++rear] = data;
			System.out.println("element inserted!   position of rear" + rear);
		} else {
			System.out.println("Queue overflow!");
		}

	}

	public int deQueue() {

		int value = 0;

		if (!isEmpty()) {
			value = queue[front++];
			return value;
		} else {
			System.out.println("Queue underflow!");
			return 0;
		}
	}

	public void display() {
		if (!isEmpty()) {
			for (int i = front + 1; i <= rear; i++) {
				System.out.println("\t" + queue[i]);
			}
		} else {
			System.out.println("Queue underflow !");
		}
	}

}
