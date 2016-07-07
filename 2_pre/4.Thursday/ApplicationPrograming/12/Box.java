package kg12;

public class Box {

    private int height; /** 高さ*/
    private int width; /** 幅 */

    public Box() {
        this.height = 3;
        this.width = 4;
        System.out.println("Boxクラスのインスタンスを作成しました");
    }

    /**
     * この長方形の面積を返します。
     *
     * @return 高さ×幅
     */
    public int getArea() {
        return height * width;
    }

    /**
     * 長方形の辺の大きさを変更します。
     *
     * @param height 高さ
     * @param width 幅
     * @throws IllegalArgumentException
     */
    public void setSize(int height, int width) throws IllegalArgumentException {
        System.out.println("height = " + height + ", width = " + width + "に値を変更します。");

        if (height < 0 || width < 0) {
            throw new IllegalArgumentException();
        }

        this.height = height;
        this.width = width;
    }

}
