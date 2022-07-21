public class Test05 {
	public static void main(String [] args) throws java.io.IOException {
		java.io.File file = new java.io.File("tmp05.txt");
		System.out.println(file.exists());
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.println("123");
		output.println(456);
		output.close();
		System.out.println(file.exists());
		System.out.println(file.length());
	}
}