class Kadai02{
  public static void main(String[] args){
    double b = -271828.1828459;
    String str;

    str = String.format("10進数:%.6f",b);
    System.out.println(str);

    str = String.format("%.3f",b);
    System.out.println(str);

    str = String.format("%,015.4f",b);
    System.out.println(str);

    str = String.format("%4e",b);
    System.out.println(str);

  }
}
