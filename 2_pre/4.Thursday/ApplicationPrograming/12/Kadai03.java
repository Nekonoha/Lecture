package kg12;

public class Kadai03 {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        
        
        try{
            b1.setSize(8, 7);
            b2.setSize(-3, 6);
        }catch(IllegalArgumentException e){
            System.out.println("負の値は入力できません");
        }

        System.out.println("b1の面積: " + b1.getArea());
        System.out.println("b2の面積: " + b2.getArea());
    }
}
