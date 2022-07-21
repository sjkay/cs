import java.util.ArrayList;
public class Test04 {
	public static void main(String [] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(new Integer(1));
		a1.add(new Integer(2));
		a1.add(new Integer(3));
		ArrayList<Integer> a2 = a1;
		a2.add(new Integer(4));
		System.out.println(a1);
		System.out.println(a2);
	}
}