public class Rectangle extends Point {
	double w,h;
	Rectangle(double initx, double inity, double initw, double inith) {
		super(initx,inity);
		w = initw;
		h = inith;
	}
	boolean isHit(Point p) {
		if (p.x > x && p.x < x + w
	    	&& p.y > y && p.y < y + h) {
	    	return true;
		}
		else {
	    	return false;
		}
	}
}