package holding;

import java.util.ArrayList;
import java.util.List;

class MyObject {
	int id = 1;
	MyObject(int init) { id = init; };
	void set(int num) { id = num; }
	public String toString() {
		return Integer.toString(id);
	}
}
public class ObjectInContainer {
	
	public static void main(String[] args) {
		MyObject obj1 = new MyObject(11);
		MyObject obj2 = new MyObject(22);
		List<MyObject> list = new ArrayList<MyObject>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj1);
		list.add(obj2);
		System.out.println(list);
		obj1.set(55);
		obj2.set(88);
		System.out.println(list);
	}
}
