class Kadai01{
  public static void main(String[] args){
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    String result;

    System.out.println("BEFORE: "+ str);

    result = str.replaceAll("[JSTz]","+");
    System.out.println("AFTER1: " + result);

    result = str.replaceAll("[D-Sd-s]","+");
    System.out.println("AFTER2: " + result);

    result = str.replaceAll("[^H-M]","+");
    System.out.println("AFTER3: " + result);
  }
}
