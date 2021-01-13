package DS_package;
public class OrderedArray { //constructor ** insertAscending ** insertDescending
							//find        ** delete          ** bubbleSort
							//display     ** swap 
	//====================================================================
	private int[]a;
	private int nElems;
	//----------
	public OrderedArray(int max) {
		a=new int[max];
		int nElems=0;
	}
	//----------
	public void insertAscending(int value) {	//put element into array
		int i;
		for(i=0 ; i<nElems ; i++)				//find where it goes
			if(value<a[i])						//linear search(ascending)
				break;
		
		for(int j=nElems ; j>i ; j--)			//move higher ons up(backward)
			a[j]=a[j-1];
		
		a[i]=value;								//insert it
		nElems++;
	}
	//----------
	public void insertDescending(int value) {	//put element into array
		int i;
		for(i=0 ; i<nElems ; i++)	//find where it goes
			if(a[i]<value)		//linear search(descending)
				break;
		for(int j=nElems ; j>i ; j--)	//move higher ons up(backward)
			a[j]=a[j-1];
		a[i]=value;					//insert it
		nElems++;
	}
	//----------
	public boolean find(int searchKey) {
		int low=0;
		int mid;
		int high=nElems-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(searchKey==a[mid])
				return true;
			else if(searchKey<a[mid])
				high=mid-1;
			else
				low=high+1;
		}
		return false;				
	}	
	//----------
	public boolean delete(int value) {
		int i;
		for(i=0 ; i<nElems ; i++)
			if(value==a[i])
				break;
		if(i==nElems)
			return false;
		else
			for(int j=i ; i<nElems-1 ; j++)
				a[i]=a[i+1];
		nElems--;
		return true;
	}
	//----------
	public void bubbleSort() {
		for(int j=nElems-1 ; j>0 ; j--)	//backward
			for(int i=0 ; i<j ; i++)	//forward
				if(a[i]>a[i+1]) {
					int temp;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
					//swap(i,i+1);
	}
	//----------
	public void display() {
		for(int i=0 ; i<nElems ; i++)
			System.out.println(a[i]);
	}
	//----------
	private void swap (int x,int y) {
		int temp;
		temp =a[x];
		a[x]=a[y];
		a[y]=temp;
		}
	//----------
	
	//====================================================================
}
