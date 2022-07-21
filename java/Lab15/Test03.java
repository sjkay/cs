import java.util.ArrayList;
public class Test03 {
	public static void main(String [] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(new Integer(3));
		a.add(new Integer(1));
		a.add(new Integer(2));
		MyCmp cmp = new MyCmp();
		a.sort(cmp);
		System.out.println(a);
	}
}