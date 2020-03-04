package esg.itp.shape;

public class Rectangle implements Polygon {
    float length;
    float breadth;
    float area1;
    float perimeter1;
    public Rectangle(float l, float b){
        this.length = l;
        this.breadth = b;
    }
    @Override
    public void calcArea() {
        this.area1= length * breadth;
    }

    @Override
    public void calcPeri() {

        this.perimeter1 = 2 *(length+breadth);
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle is: " +this.area1);
        System.out.println("Perimeter of Rectangle is: "+this.perimeter1);
    }
}
