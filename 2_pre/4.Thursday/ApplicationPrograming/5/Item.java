public class Item{
	private String name;
	private int price;
	private static int sum;	
		
	public Item(String name, int price){
		this.name = name;
		this.price = price;
		this.sum += price;
	}

	public String getProperties(){
		return this.name + ", " + price;
	}

	public static int getSum(){
		return sum;
	}
}
