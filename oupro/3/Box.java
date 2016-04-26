public class Box{
	private int width;
	private int height;

	public Box(){
		width = (int)(Math.random()*3)+5;
		height = (int)(Math.random()*2)+2;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getPerimeter(){
		return width*2 + height*2;
	}

	public int getArea(){
		return width*height;
	}
}
