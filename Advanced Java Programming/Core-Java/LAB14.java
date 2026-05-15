// ── AreaDemo.java (main class) ────────────────────────
import Area.*;
public class LAB14 {
    public static void main(String[] args) {
        AreaRectangle rect   = new AreaRectangle();
        AreaCircle    circle = new AreaCircle();
        AreaSquare    sq     = new AreaSquare();
        System.out.printf("Rectangle area (5x3)   = %.2f%n", rect.area(5, 3));
        System.out.printf("Circle    area (r=7)   = %.2f%n", circle.area(7));
        System.out.printf("Square    area (s=4)   = %.2f%n", sq.area(4));
    }
}
