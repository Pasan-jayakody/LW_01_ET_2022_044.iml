import java.util.Scanner;
class Circle {
    private double radius;
    public Circle(double r) {
        radius = r;
    }
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = input.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        double shadedArea = outerArea - innerArea;

        System.out.println("The area of the circular region is: " + shadedArea);
        input.close();
    }
}

