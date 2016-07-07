package kg12;

import java.util.Random;

public class Person {

    private String name;/** 名前*/
    private double height;/** 身長 */

    /**
     * このコンストラクタは、フィールドのnameを引数の値で初期化します。
     * フィールドのheightは140.0以上(inclusive)190.0未満(exclusive)の 乱数で初期化されます。
     *
     * @param name 初期化後の名前
     */
    public Person(String name) {
        this.name = name;
        this.height = new Random().nextDouble() * (190.0 - 140.0) + 140.0;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return String.format("Person{name=%s, height=%.1f}", name, height);
    }

}
