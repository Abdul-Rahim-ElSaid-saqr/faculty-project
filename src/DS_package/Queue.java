package DS_package;
//Queue-enQueue-deQueue-isEmpty-isFull-display-peek
public class Queue{
	private int maxSize;
	private int[]arrayQueue;
	private int front;
	private int rear;
	//----------
	public Queue(int s) {
		maxSize=s;
		arrayQueue=new int[maxSize];
		front=0;
		rear=-1;
	}
	//----------
	public void enQueue(int value) {
		arrayQueue[++rear]=value;
	}
	//----------
	public int deQueue() {
		return arrayQueue[front++];
	}
	//----------
	public int peek() {
		return arrayQueue[front];
	}
	//----------
	public boolean isEmpty() {
		return (rear==-1);
	}
	//----------
	public boolean isFull() {
		return (rear==maxSize-1);
	}
	//----------
	public void display() {
		while(!isEmpty()) {
			System.out.println(deQueue());
		}
	}
	//----------
}








