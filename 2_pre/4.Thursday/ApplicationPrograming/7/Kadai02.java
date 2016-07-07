class Kadai02{
  public static void main(String[] args){
    String str = "CS(Computer Science) 2016";
    String result;
    
    System.out.println("BEFORE: " + str);

    result = str.replaceAll("CS","*");
    System.out.println("AFTER1: " + result);

    result = str.replaceAll("[CS]","*");
    System.out.println("AFTER2: " + result);

    result = str.replaceAll("[^A-Z]","*");
    System.out.println("AFTER3: " + result);
    
    result = str.replaceAll("\\W","-");
    System.out.println("AFTER4: " + result);

    result = str.replaceAll("e.","#");
    System.out.println("AFTER5: " + result);
  }
}
