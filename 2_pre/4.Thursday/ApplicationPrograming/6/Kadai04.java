class Kadai04{
  public static void main(String[] args){
    String str2 = "1404-1, Katakuramachi, Hachioji, Tokyo 192-0982, JAPAN";
    String result;

    System.out.println(str2);

    result = str2.replaceAll("achi","cho");
    System.out.println(result);

    result = str2.replaceAll("[achijk]","*");
    System.out.println(result);

    result = str2.replaceAll("a..","#");
    System.out.println(result);

    result = str2.replaceAll("\\d\\d\\d\\d","????");
    System.out.println(result);
  }
}
