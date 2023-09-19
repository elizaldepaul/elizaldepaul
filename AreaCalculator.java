package kahitAno;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.println("5. Trapezoid");
        System.out.println("6. Ellipse");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                calculateRectangleArea();
                break;
            case 2:
                calculateSquareArea();
                break;
            case 3:
                calculateTriangleArea();
                break;
            case 4:
                calculateCircleArea();
                break;
            case 5:
                calculateTrapezoidArea();
                break;
            case 6:
                calculateEllipseArea();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
    
    public static void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
        scanner.close();
    }
    
    public static void calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("Area of the square: " + area);
        scanner.close();
    }
    
    public static void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
        scanner.close();
    }
    
    public static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        scanner.close();
    }
    
    public static void calculateTrapezoidArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first base: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter the length of the second base: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter the height of the trapezoid: ");
        double height = scanner.nextDouble();
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area of the trapezoid: " + area);
        scanner.close();
    }
    
    public static void calculateEllipseArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the major axis: ");
        double majorAxis = scanner.nextDouble();
        System.out.print("Enter the length of the minor axis: ");
        double minorAxis = scanner.nextDouble();
        double area = Math.PI * majorAxis * minorAxis;
        System.out.println("Area of the ellipse: " + area);
        scanner.close();
    }
}