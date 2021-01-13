package DS_package;
class StackX{
	private int maxSize;
	private int[]stackArray;
	private int top;
	//----------
	public StackX(int s) {
		maxSize=s;
		stackArray=new int[maxSize];
		top=-1;
	}
	//----------
	public void push(int j) {
		stackArray[++top]=j;
	}
	//----------
	public int pop() {
		return stackArray[top--];
	}
	//----------
	public int peek() {
		return stackArray[top];
	}
	//----------
	public boolean isEmpty() {
		return (top==-1);
	}
	//----------
	public boolean isFull() {
		return (top==maxSize-1);
	}
	//----------
	public void display() {
		while(!isEmpty()) {
			int value=pop();
			System.out.println(value);
		}
	}
	//----------
	public void displayStackAtBottom() {
		StackX tempS=new StackX(maxSize);
		while(!isEmpty()) {
			tempS.push(pop());
		}
		
		while(!tempS.isEmpty()) {
			int value=tempS.pop();
			System.out.println(value);
			push(value);//to return values in first stack
		}
	}
	//----------
}





