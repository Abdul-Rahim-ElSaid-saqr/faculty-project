package DS_package;
//PriorityQueue-insert-deQueue-deQueueMIN-deQueueMAX
//isEmpty-isFull-display-peekMIN-peekMAX
public class PriorityQueue{
	private int maxSize;
	private int[]arrayQueue;
	private int nItems;
	//----------
	public PriorityQueue(int s) {
		maxSize=s;
		arrayQueue=new int[maxSize];
		nItems=0;
	}
	//----------
	public void insert(int value) {
		int j;
		if(nItems==0)
			arrayQueue[nItems++]=value;
		else {
			for(j=nItems-1 ; j>=0 ; j--) {
				if(value<arrayQueue[j])		//Ascending order
					arrayQueue[j+1]=arrayQueue[j];
				else
					break;
			}
			arrayQueue[j+1]=value;
			nItems++;
		}
	}
	//----------
		public int deQueueMIN() {
			nItems--;
			return arrayQueue[0];
		}
	//----------
	public int deQueueMAX() {
		return arrayQueue[--nItems];
	}
	//----------
	public int peekMIN() {
		return arrayQueue[0];
	}
	//----------
	public int peekMAX() {
		return arrayQueue[nItems-1];
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
			System.out.println(deQueueMAX());
		}
	}
	//----------
}
