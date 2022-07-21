import java.util.ArrayList;
public class Test01 {
	public static void main(String [] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(new Integer(1));
		a.add(new Integer(2));
		a.add(new Integer(3));
		for(Integer i : a) {
			System.out.println(i);
		}
	}
}