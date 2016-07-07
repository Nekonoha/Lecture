class Kadai03{
	public static void main(String[] args){

		for(int i=0; i<10; i++){
			int r = new java.util.Random().nextInt(101);
			char c;

			if(r >= 90){
				c ='S';
			}else if(r >= 80){
				c = 'A';
			}else if(r >= 70){
				c = 'B';
			}else if(r >= 60){
				c = 'C';
			}else{
				c = 'D';
			}

			System.out.println("得点："+ r +"、成績："+ c);
		}

	}
}
