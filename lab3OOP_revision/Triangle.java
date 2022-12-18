public class Triangle extends Polygon {
    public Triangle() {
        super();
    }

    public int getArea() {
        return (int)(height * width) / 2;
    }
}