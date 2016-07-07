public class Person{
	private String name;
	private double height;
	private double weight;

	public Person(String nm){
		name = nm;
	}

	public String getName(){
		return this.name;
	}

	public void setParams(double h, double w){
		this.height = h;
		this.weight = w;
	}

	public double getBMI(){
		return weight/(height*height);
	}

}
