public class Rectangle {
    // Properties of the rectangle (width and height)
    public double width;
    public double height;

    // Constructor to initialize the width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area: Area = width * height
    public double getArea() {
        return width * height;
    }

    // Method to calculate the perimeter: Perimeter = 2 * width + 2 * height
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    // Method to calculate the diagonal using Pythagorean theorem: Diagonal = sqrt(width^2 + height^2)
    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    // Getter method to return the width
    public double getWidth() {
        return width;
    }

    // Getter method to return the height
    public double getHeight() {
        return height;
    }
}

