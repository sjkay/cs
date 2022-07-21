import java.util.ArrayList;
public class Prime {
	public static void main(String []args) {
		ArrayList<Object> al = new ArrayList<>();
		int n = 120;
		for(int i = 0; i < n; i++) {
			al.add((Object)1);
		}
		al.set(0,(Object)0);
		al.set(1,(Object)0);
		for(int i = 2; i < n; i++) {
			for(int j = 2; i*j < n; j++) {
				al.set(i*j,(Object)0);
			}
		}
		for(int i = 0; i < n; i++) {
			if (al.get(i) == (Object)1) {
				System.out.println(i);
			}
		}
	}
}