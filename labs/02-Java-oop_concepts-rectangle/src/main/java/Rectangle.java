public record Rectangle(double width, double height) {
    /**
     * Returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     * Returns the diagonal of the rectangle.
     *
     * @return the diagonal of the rectangle
     */
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the rectangle.
     *
     * @return the height of the rectangle
     */
    public double getHeight() {
        return height;
    }
}
