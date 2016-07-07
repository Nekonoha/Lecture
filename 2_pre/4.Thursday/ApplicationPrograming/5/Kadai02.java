class Kadai02{
	public static void main(String[] args){
		System.out.println("Total price: " + Item.getSum());

		Item[] items = new Item[3];
		items[0] = new Item("Water", 100);
		items[1] = new Item("Yogurt", 148);
		items[2] = new Item("Sandwich", 239);

		for(int i = 0; i < items.length; i++){
			System.out.println(items[i].getProperties());

		}
	
		System.out.println("Total price: " + Item.getSum());



	}
}
