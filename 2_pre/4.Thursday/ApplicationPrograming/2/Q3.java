class Q3{
	public static void main(String[] args){
		Box b;

		b = new Box();

		b.setWidth(5);
		b.setHeight(3);

		int area = b.getArea();
		System.out.println("AREA: " + area);
	}
}
