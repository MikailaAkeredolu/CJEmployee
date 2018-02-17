/**
 * Created by makerofapps on 12/7/17.
 */
public class Rectangle {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //instance variables - ivar
    private int length;
    private int width;

    //constructor
    public Rectangle(int length, int width ){
        this.length = length;
        this.width = width;
    }

    //Method
    public int calculateArea(){
        return this.length * this.width;
    }


}
