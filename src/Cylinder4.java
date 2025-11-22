public class Cylinder4 extends Circle4{
    private double height = 1.0;

    public Cylinder4() {
        super();
    }
    public Cylinder4(double height){
        super();
        this.height = height;
    }
    public Cylinder4(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder4(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }
    @Override
    public double getArea() {
        return 2*Math.PI*getRadius() * height + 2*super.getArea();
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume() {
        return Math.PI*2*height*height;
    }
    @Override
    public String toString() {
        return "Volume is:"+getVolume();
    }
}

