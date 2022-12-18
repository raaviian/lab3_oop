public class Main {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        System.out.println("Area of polygon: " + polygon.getArea());

        Triangle triangle = new Triangle();
        triangle.setHeight(3);
        triangle.setWidth(4);

        System.out.println("Area of triangle: " + triangle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        
    }
}
