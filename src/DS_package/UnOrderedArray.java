package DS_package;
public class UnOrderedArray {
	//==============================================================================
	private int[]a;							//*********
	private int nElems;						//*********
	
	//--------
	public UnOrderedArray(int max) {		//*********
		a=new int[max];						//
		nElems=0;							//
	}										//*********
	//--------
	public void insert(int value) {
		a[nElems]=value;
		nElems++;
	}
	//--------
	public void search(int searchKey) {
		int i;
		for(i=0 ; i<nElems ; i++)
			if(searchKey==a[i])
				break;
		if(i==nElems)
			System.out.println(searchKey+"not found");
		else
			System.out.println("search key founded in "+"a["+i+"]");
			
	}
	//--------
	public void display() {
		for(int i=0 ; i<nElems ; i++)
			System.out.println(a[i]);
	}
	//--------
	public void bubbleSort() {
		int out,in;
		for(out=nElems-1 ; out>=1 ; out--)
			for(in=0 ; in<out ; in++)
				if(a[in]>a[in+1])
					swap(in,in+1);
	}
	//--------
	public void selectionSort() {
		int out,in,min;
		for(out=0 ; out<nElems-1 ; out++) {
			min=out;
			for(in=out+1 ; in<nElems ; in++)
				if(a[min]>a[in])
					min=in;
			swap(out,min);//if the array already sorted,how many number of swaps?
		}
	}
	//--
	public void selectionSort2() {
		int out,in,min;int swap=0;
		for(out=0 ; out<nElems-1 ; out++) {
			min=out;
			for(in=out+1 ; in<nElems ; in++)
				if(a[min]>a[in])
					min=in;
			if(min!=out)
				swap(min,out);
		}
	}
	//--------
	public void insertionSort() {
		int out,j,temp;
		for(out=1 ; out<nElems ; out++) {
			temp=a[out];
			
			j=out-1;
			while(j>=0 && temp<=a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
	}
	//--------
	private void swap(int one,int two) {
		int temp;
		temp=a[one];
		a[one]=a[two];
		a[two]=temp;
	}
	//===============================================================================
	public static void main(String args[]) {
		UnOrderedArray obj=new UnOrderedArray(55);
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.selectionSort();
		obj.display();
	}
}







