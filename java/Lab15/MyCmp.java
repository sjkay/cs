import java.util.Comparator;
public class MyCmp implements Comparator<Integer> {
	@Override
	public int compare(Integer x, Integer y) {
		return x - y;
	}
}
