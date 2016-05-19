class Kadai04{
  public static void main(String[] args){
    String str1 = "<h1>Hello, World!</h1> <p>This is a Paragraph.</p>";
    String str2 = "TEL: 042-637-2111, DATE: 20160519, TIME: 144459";
    String result;

    System.out.println("BEFORE: " + str1);

    result = str1.replaceAll("<.{0,4}>","");
    System.out.println("AFTER1: " + result);
    
    System.out.println("BEFORE: " + str2);
    
    result = str2.replaceAll("\\d{4,}","*");
    System.out.println("AFTER2: " + result);
  }
}
