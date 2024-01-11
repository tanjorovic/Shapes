package shape;
public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {
         return 4*Math.PI*Math.pow(getRadius(),2);
    }
    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(getRadius(),3);
    }

}