public class TestCylinder {
    public static void main(String[] args){

        Circle4 ci = new Circle4(5);
        Cylinder4 cy = new Cylinder4(5,10);

        System.out.println(Circle4.getArea());
        System.out.println(Cylinder4.getArea());

        Cylinder4 c = new Cylinder4();
        System.out.println("Cylinder:"
                + "radius:"+c.getRadius()
                +"height"+c.getHeight()
                +"Area:"+c.getArea()
                +"Volume:"+c.getVolume());

        Cylinder4 c1 = new Cylinder4();
        System.out.println("Cylinder"
                +"radius:"+c1.getRadius()
                +"height:"+c1.getHeight()
                +"Area:"+c1.getArea()
                +"Volume:"+c1.getVolume());

    }
}
