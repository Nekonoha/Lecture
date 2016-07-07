class Kadai03{
  public static void main(String[] args){
    String str = "C0115901, C0115902, B0115901, E0115901, M0115901, M0115902";
    String result;

    System.out.println("BEFORE: " + str );

    result = str.replaceAll("[0-9]{7}","*");
    System.out.println("AFTER1: " + result);
    
    result = str.replaceAll("\\w{8}","*");
    System.out.println("AFTER2: " + result);

    result = str.replaceAll("C.{7}","*");
    System.out.println("AFTER3: " + result);
    
    result = str.replaceAll("^.","*");
    System.out.println("AFTER4: " + result);
    
    result = str.replaceAll(".{7}$","*");
    System.out.println("AFTER5: " + result);
     
  }
}
