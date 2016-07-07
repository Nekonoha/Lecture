class Kadai02{
	public static void main(String[] args){
		Student st1 = new Student();
		st1.setScore(88,56);

		System.out.println("Student 1");
		System.out.println("AVERAGE: "+st1.getAverage());
		System.out.println("PASS: "+st1.isPass());

		Student st2 = new Student();
		st2.setScore(66,63);

		System.out.println("Student 2");
		System.out.println("AVERAGE: "+st2.getAverage());
		System.out.println("PASS: "+st2.isPass());

		
		
	}
}
