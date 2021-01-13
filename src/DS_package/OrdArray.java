package DS_package;
class OrdArray{ //constructor ** insert_Ascending  ** insert_Descinding
				//find        ** delete            ** display
	private int a[];
	private int nElems;
	//--------
	public OrdArray(int max){
		a=new int[max];
		nElems=0;
	}
	//---------
	public void insert_Ascending(int value) {	//put element into array
		int i;
		for(i=0 ; i<nElems ; i++)				//find where it goes
			if(value<a[i])						//linear search(ascending)
				break;
		
		for(int j=nElems ; j>i ; j--)			//move higher ons up(backward)
			a[j]=a[j-1];
		
		a[i]=value;								//insert it
		nElems++;
	}
	//---------
	public void insert_Descinding(int value) {	//put element into array
		int i;
		for(i=0 ; i<nElems ; i++)	//find where it goes
			if(a[i]<value)		//linear search(descending)
				break;
		for(int j=nElems ; j>i ; j--)	//move higher ons up(backward)
			a[j]=a[j-1];
		a[i]=value;					//insert it
		nElems++;
	}
	//--------
	public boolean find(int value) {
		//binary search
		int low=0;
		int mid;
		int high=nElems-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(value==a[mid])
				return true;
			else if(value<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return false;
	}
	//--------
	public void delete(int value) {
		int i;
		for(i=0 ; i<nElems ; i++)
			if(value==a[i])
				break;
		if(i==nElems)
			System.out.println(value+"not found");
		else {
			for(int j=i ; j<nElems-1 ; j++)
				a[j]=a[j+1];
			nElems--;
		}
	}
	//--------
	public void display() {
		for(int i=0 ; i<nElems ; i++)
			System.out.println(a[i]);
	}
}




