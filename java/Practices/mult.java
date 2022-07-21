public class mult {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i< 1E1; i++) {
			if (i%3 == 0 || i%5 ==0 ) {
				sum += i;
			} 
		}
		System.out.println(sum);
		System.out.println(1E1);
		System.out.println(32E2);
		System.out.println(3E5);
	}
}