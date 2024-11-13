import java.awt.Rectangle;

public class RectangleObjects {
  public static void main(String[] args) {
    // TODO code here...
  }

  private static void printRectangleProperties(Rectangle rectangle) {
    System.out.println(
        Colors.ANSI_PURPLE + "Printing properties of Rectangle:" + Colors.ANSI_RESET);

    // width
    System.out.println(
        Colors.ANSI_CYAN
            + "Width"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getWidth()
            + Colors.ANSI_RESET);

    // height
    System.out.println(
        Colors.ANSI_CYAN
            + "Height"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getHeight()
            + Colors.ANSI_RESET);

    // area
    System.out.println(
        Colors.ANSI_CYAN
            + "Area"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getArea()
            + Colors.ANSI_RESET);

    // perimeter
    System.out.println(
        Colors.ANSI_CYAN
            + "Perimeter"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getPerimeter()
            + Colors.ANSI_RESET);

    // diagonal
    System.out.println(
        Colors.ANSI_CYAN
            + "Diagonal"
            + Colors.ANSI_RESET
            + ": "
            + Colors.ANSI_YELLOW
            + rectangle.getDiagonal()
            + Colors.ANSI_RESET);

    System.out.println(
        Colors.ANSI_BLACK + "==================================" + Colors.ANSI_RESET);
  }
}
