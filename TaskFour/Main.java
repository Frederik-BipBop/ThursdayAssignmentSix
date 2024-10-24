package TaskFour;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square (15);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        ShapeBuilder shapebuilder = new ShapeBuilder();
        Circle circle1 = new Circle(5.3);
        Circle circle2 = new Circle(6.8);
        Circle circle3 = new Circle(12.5);
        Square square1 = new Square(15.4);
        Square square2 = new Square(10.7);
        Square square3 = new Square(27.2);
        shapebuilder.addShape(circle1);
        shapebuilder.addShape(circle2);
        shapebuilder.addShape(circle3);
        shapebuilder.addShape(square1);
        shapebuilder.addShape(square2);
        shapebuilder.addShape(square3);

        double totalArea = shapebuilder.getTotalArea();
        System.out.println("Det samlede areal af alle de former er : " + totalArea);

    }

}
