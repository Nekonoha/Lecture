class Sample01{
	public static void main(String[] args){
		String istr = "Tokyo University of Technology";

		char c = istr.charAt(2);
		System.out.println("char at position 2 is " + c);

		String ostr = istr.toLowerCase();
		System.out.println(ostr);

		System.out.println("index of o is " + istr.indexOf('o'));

		System.out.println("index of o is " + istr.lastIndexOf('o'));

		String str = new String("University").toLowerCase();

		if(str.equals(new String("university"))){
			System.out.println("onaji");
		}else{
			System.out.println("tigau");
		}




	}
}
