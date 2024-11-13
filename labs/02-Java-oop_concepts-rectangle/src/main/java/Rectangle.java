public class Rectangle {
    private double width;
    private double height;


    // Constructor
    public Rectangle(double width, double height) {
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
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getDiagonal() {
        return Double.parseDouble(String.format("%.2f", Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))));
    }
}
