package src.design_patterns.structural_patterns;

interface Color {
    String getColorName();

    default void paint() {
        System.out.println("The shape is painted " + this.getColorName());
    }
}

class Red implements Color {
    private String colorName = "Red";

    public String getColorName() {
        return this.colorName;
    }
}

class Blue implements Color {
    private String colorName = "Blue";

    public String getColorName() {
        return this.colorName;
    }
}

class Pink implements Color {
    private String colorName = "Pink";

    public String getColorName() {
        return this.colorName;
    }
}

abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
        System.out.println("I want to paint the Circle " + this.color.getColorName());
        this.color.paint();
        System.out.println();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
        System.out.println("I want to paint the Square " + this.color.getColorName());
        this.color.paint();
        System.out.println();
    }
}

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
        System.out.println("I want to paint the Triangle " + this.color.getColorName());
        this.color.paint();
        System.out.println();
    }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Color pink = new Pink();

        Shape redCircle = new Circle(red);
        Shape blueCircle = new Circle(blue);
        Shape redSquare = new Square(red);
        Shape blueSquare = new Square(blue);
        Shape redTriangle = new Triangle(red);
        Shape blueTriangle = new Triangle(blue);
        Shape pinkTriangle = new Triangle(pink);

        redCircle.draw();
        blueCircle.draw();
        redSquare.draw();
        blueSquare.draw();
        redTriangle.draw();
        blueTriangle.draw();
        pinkTriangle.draw();
    }
}
