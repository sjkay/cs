public class Lab06_2 {
	double a = 3.4;
	double b = 50.2;
	double e = 44.5;
	double c = 2.1;
	double d = 0.55;
	double f = 5.9;
	double x() {
		return (e*d - b*f)/(a*d - b*c);
	}
	double y() {
		return (a*f - e*c)/(a*d - b*c);
	}
    public static void main(String[] args) {
    	Lab06_2 obj = new Lab06_2();
        System.out.println("x = " + obj.x());
        System.out.println("y = " + obj.y());
    }
}