import java.util.ArrayList;
public class RemoveObject {
	public static void main(String [] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.remove(new Integer(3));
		System.out.println(al);
	}
}