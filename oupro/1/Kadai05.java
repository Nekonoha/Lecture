class Kadai05{
	public static void main(String[] args){
		int[] a = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6};

		for(int i=0; i<=9; i++){
			System.out.print(i +"|");
			for(int j=0; j<a.length; j++){
				if(a[j]==i){
					System.out.print("*");
				}
			}
			System.out.println();
		}


	}
}
