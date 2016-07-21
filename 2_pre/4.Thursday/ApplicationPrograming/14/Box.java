/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg14;

class Box {
    private int width,height;
    
    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * 四角形のインスタンスの対角線の長さを返す。
     * @return (width^2 + height^2)^(1/2)
     */
    public double getDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    } 
    /**
     * width に dw を、 height に dh を足す。
     * @param dw widthに足す値
     * @param dh heightに足す値
     */
    public void changeSize(int dw, int dh){
        this.width += dw;
        this.height += dh;
    }
    
    @Override
    public String toString(){
        return width + " x " + height;
    }
}
