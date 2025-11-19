public class RectangleQ {
    private double length=1.0;
    private double width = 1.0;

    public RectangleQ() {}
    public RectangleQ(double length){
        this.length = length;
    }
    public RectangleQ(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void  setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*length+2*width;
    }
    @Override
    public String toString() {
        return("Area:"+ getArea() + "Perimeter:"+getPerimeter() );
    }
}
