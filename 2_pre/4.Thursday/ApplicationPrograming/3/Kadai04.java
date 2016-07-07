class Kadai04{
	public static void main(String[] args){
		Box[] bs = new Box[3];

		for(int i=0; i<bs.length; i++){
			bs[i] = new Box();
		}

		for(int i=0; i<bs.length; i++){
			System.out.print(bs[i].getWidth()+","+bs[i].getHeight());
			System.out.print(",PERIMETER:" + bs[i].getPerimeter());
			System.out.println(",AREA:"+bs[i].getArea());
		}
	}
}
