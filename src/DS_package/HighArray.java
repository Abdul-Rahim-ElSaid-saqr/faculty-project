package DS_package;
class HighArray{//constructor       ** insert
				//find_linearSearch ** find_binarySearch
				//delete            ** display
	private int a[];
	private int nElems;
	//----------
	public HighArray(int max){
		a=new int[max];
		nElems=0;
	}
	//----------
	public void insert(int value) {
		a[nElems]=value;
		nElems++;
	}
	//----------
	public boolean find_linearSearch(int searchKey) {
		int i;
		for(i=0 ; i<nElems ; i++)
			if(searchKey==a[i])
				break;
		if(i==nElems)
			return false;
		else
			return true;
	}
	
	//----------
	public static boolean find_binarySearch(int name[],int value) {
		//we use this method when the array already sorted
		int size=name.length;
		
		int low=0;
		int mid;
		int high=size-1;
		while(low<=high) {
			mid=((low+high)/2);
			if(value==name[mid])
				return true;
			else if(value<name[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return false;
	}
	//----------
	public void delet(int value) {
		int i;
		for(i=0 ; i<nElems ; i++)
			if(a[i]==value)
				break;
		if(i==nElems)
			System.out.println("the value not found");
		else {
			for(int j=i ; j<nElems-1 ; j++)
				a[j]=a[j+1];
		}
		nElems--;
	}
	//----------
	public void display() {
		for(int i=0 ; i<nElems ; i++)
			System.out.println(a[i]);
	}
}




