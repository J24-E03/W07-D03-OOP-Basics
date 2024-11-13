import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class RectangleObjects {

    public static void main(String[] args) {
      // Create instances of the custom Rectangle class
      Rectangle rectangle1 = new Rectangle(45, 78);
      Rectangle rectangle2 = new Rectangle(30, 50);

      // Print properties of each rectangle
      printRectangleProperties(rectangle1);
      printRectangleProperties(rectangle2);
      // Print the area of the rectangle to the console
      System.out.println("The area of the rectangle is " + Rectangle.getArea());
      // Print the perimeter of the rectangle to the console
      System.out.println("The perimeter of the rectangle is " + Rectangle.getPerimeter());
      // Print the diagonal of the rectangle to the console
      System.out.println("The perimeter of the rectangle is " + Rectangle.getDagonal());



    }

  private static void printRectangleProperties(Rectangle rectangle) {
    System.out.println(Colors.ANSI_PURPLE + "Printing properties of Rectangle:" + Colors.ANSI_RESET);
    System.out.println(Colors.ANSI_PURPLE + "Printing properties of Rectangle:" + Colors.ANSI_RESET);

    // width
    System.out.println(Colors.ANSI_CYAN
            + "Width"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getWidth()
            + Colors.ANSI_RESET);

    System.out.println(Colors.ANSI_CYAN
            + "Width"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getWidth()
            + Colors.ANSI_RESET);

    // height
    System.out.println(Colors.ANSI_CYAN
            + "Height"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getHeight()
            + Colors.ANSI_RESET);

    System.out.println(Colors.ANSI_CYAN
            + "Height"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getHeight()
            + Colors.ANSI_RESET);

    // area
    System.out.println(Colors.ANSI_CYAN
            + "Area"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getArea()
            + Colors.ANSI_RESET);

    System.out.println(Colors.ANSI_CYAN
            + "Area"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getArea()
            + Colors.ANSI_RESET);

    // perimeter
    System.out.println(Colors.ANSI_CYAN
            + "Perimeter"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getPerimeter()
            + Colors.ANSI_RESET);
    System.out.println(Colors.ANSI_CYAN
            + "Perimeter"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getPerimeter()
            + Colors.ANSI_RESET);

    // diagonal
    System.out.println(Colors.ANSI_CYAN
            + "Diagonal"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getDiagonal()
            + Colors.ANSI_RESET);
    System.out.println(Colors.ANSI_CYAN
            + "Diagonal"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getDiagonal()
            + Colors.ANSI_RESET);

    System.out.println(Colors.ANSI_BLACK + "==================================" + Colors.ANSI_RESET);
  }
}