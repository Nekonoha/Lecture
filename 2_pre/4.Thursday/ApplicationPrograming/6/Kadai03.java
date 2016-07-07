class Kadai03{
  public static void main(String[] args){
    String str1 = "School of Computer Science";
    String result;

    System.out.println(str1);

    result = str1.replaceAll("of","for");
    System.out.println(result);

    result = str1.replaceAll(" ","");
    System.out.println(result);

    result = str1.replaceAll("o","*");
    System.out.println(result);

    result = str1.replaceAll("[^eo]","?");
    System.out.println(result);
  }
}
