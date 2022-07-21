import java.util.Scanner;
public class Test06 {
	public static void main(String [] args) {
		String address = "http://www.korea.ac.kr";
		try {
			java.net.URL url = new java.net.URL(address);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("I/O error");
		}
	}
}