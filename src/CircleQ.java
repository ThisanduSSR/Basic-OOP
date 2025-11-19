public class CircleQ {
    private double radius=1.0;
    private String color="blue";

    public CircleQ(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public CircleQ(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
