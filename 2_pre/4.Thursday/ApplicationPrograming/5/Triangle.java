public class Triangle{
	private double a,b,c;

	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangle(){
		if(a<b+c && b <c+a && c<a+b){
			return true;
		}else{
			return false;
		}
	}

	public double getArea(){
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

