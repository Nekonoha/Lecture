public class Cube{
	private int side;

	public Cube(int side){
		this.side = side;
	}

	public int getSide(){
		return side;
	}

	public int getSurfaceArea(){
		return side*side*6; 
	}

	public int getVolume(){
		return side*side*side;
	}

}
