public class Rectangle {
    private double width;
    private double height;


    // Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Methods
    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*width + 2*height;
    }

    public double getDiagonal() {
        return Math.sqrt(width*width + height*height);

    }
}
