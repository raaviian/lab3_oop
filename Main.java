public class Main {
    public static void main(String[] args) {
    // make polygon as new object called obj1
    Polygon obj1 = new Polygon();
    // output should be "area of obj1 = 0"
    System.out.println("\n\narea of polygon = " + obj1.getArea()+"\n");

    // make  triangle as new object called obj2
    Triangle obj2 = new Triangle();
    // output triangle should be "area of obj2 = 15"
    System.out.println("area of triangle = " + obj2.getArea()+"\n");

    // make rectangle as new object called obj3
    Rectangle obj3 = new Rectangle();
    // output rectangle should be "area of rectangle = 25"
    System.out.println("area of rectangle = " + obj3.calcArea()
    +"\n\n");
    }
}