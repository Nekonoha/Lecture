class Q4{
	public static void main(String[] args){
		Person p1;
		String str;
		double bmi;
		
		p1 = new Person("masahiro");
		
		str = p1.getName();
		p1.setParams(1.65,56.8);
		bmi = p1.getBMI();
		
		System.out.println("NAME: "+ str);
		System.out.println("BMI: "+ bmi);

	}
}
