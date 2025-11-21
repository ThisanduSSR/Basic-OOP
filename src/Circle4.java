public class Circle4 {
    private double radius=1.0;
    private String color="blue";

    public Circle4() {
    }
    public Circle4(double r){
        radius = r;
    }
    public Circle4(double r, String color){
        radius = r;
        color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColour() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Area is:"+ getArea();
    }
}
