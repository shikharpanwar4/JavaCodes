package esg.itp.shape;

public class Square implements Polygon {
    float side;
    float area2;
    float perimeter2;
    public Square(float s){
        this.side = s;
    }

    @Override
    public void calcArea() {

        this.area2 = side * side;
    }

    @Override
    public void calcPeri() {

        this.perimeter2 = side*4;
    }

    @Override
    public void display() {
        System.out.println("Area of Square is: " +this.area2);
        System.out.println("Perimeter of Square is: " +this.perimeter2);
    }
}
