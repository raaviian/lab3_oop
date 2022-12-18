// Name : Raviansyah Noorman (AI210032), Object oriented programming Section 4

public class Polygon {
    // constructor for class polygon
    public float height;
    public float width;
    public Polygon() { this.height = 5;this.width = 5;}
    // +getArea() : int
    public int getArea() {return 0;}
}
// inheritance class Triangle from Polygon
class Triangle extends Polygon {
    // +getArea() : int
    public int getArea(){return (int)(this.height * this.width)/2;}
}
// inheritance class Rectangle from Polygon
class Rectangle extends Polygon {
    // +calcArea() : int
    public int calcArea() {return (int)(this.height * this.width);}
}