public class TestCylinder {
    public static void main(String[] args){

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
