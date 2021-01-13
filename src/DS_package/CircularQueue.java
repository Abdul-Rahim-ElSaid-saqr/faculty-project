package DS_package;
//CircularQueue-enQueue-deQueue-isEmpty-isFull-display-peek
public class CircularQueue{
	private int maxSize;
	private int[]arrayQueue;
	private int front;
	private int rear;
	private int nItems;
	//----------
	public CircularQueue(int s) {
		maxSize=s;
		arrayQueue=new int[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	//----------
	public void enQueue(int value) {//push rear then put in him
		if(rear==maxSize-1)
			rear=-1;
		arrayQueue[++rear]=value;
		nItems++;
	}
	//----------
	public int deQueue() {//take from front then push him
		int temp=arrayQueue[front++];
		if(front==maxSize)
			front=0;
		nItems--;
		return temp;
	}
	//----------
	public int peek() {
		return arrayQueue[front];
	}
	//----------
	public boolean isEmpty() {
		return (nItems==0);
	}
	//----------
	public boolean isFull() {
		return (nItems==maxSize);
	}
	//----------
	public void display() {
		while(!isEmpty()) {
			System.out.println(deQueue());
		}
	}
	//----------
}