package OS_package;
import java.util.ArrayList;
class Medicine{

	private String name;
	private double price;
	private String indication;
	//----------
	public Medicine(String name,double price,String indication) {
		setName(name);
		setPrice(price);
		setIndication(indication);
	}
	//----------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//----------
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	//----------
	public String getIndication() {
		return indication;
	}
	public void setIndication(String indication) {
		this.indication=indication;
	}
	//----------

}
class ArrayListTest{
	public static void main(String args[]) {
		String s="abdo"+5+"sakr"+5;
		//obj.add(10);
		//obj.size();
		//obj.set(0, 50);
		//obj.get(1);
		//obj.remove(0);
		//obj.clear();
		System.out.println(s);
	}
}
















