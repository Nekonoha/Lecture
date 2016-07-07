class Kadai03{
	public static void main(String[] args){
		String[] strs = new String[4];
		strs[0] = "Kadai01.txt";
		strs[1] = "Katakuramachi, Hachioji, Tokyo";
		strs[2] = "Before-tax price is 800 yen";
		strs[3] = "Kadai03.txt";

		System.out.println(strs[0].indexOf("a",2));
		System.out.println(strs[1].substring(strs[1].indexOf("machi"),strs[1].indexOf(",")));
		System.out.println(Integer.parseInt(strs[2].split(" ")[3])*1.08);
		System.out.println(strs[3] + "　の index は　" +  "3");
	}
}
