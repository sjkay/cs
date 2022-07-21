import java.util.ArrayList;
public class TestAL {
	public static void main(String [] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(3);
		al.add(4);
		al.add(new Integer(5));
		for(Object x: al) {
			System.out.println(x);
		}
	}
}