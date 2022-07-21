public class even {
	public static void main(String[] args) {
		int sum =0;
		int x = 1;
		int y = 1;
		while (x <= 4E6) {
			if (x%2==0) {
				sum += x;
			}
			int temp = x;
			x = y;
			y += temp;
			
		}
		System.out.println(sum);
	}
}