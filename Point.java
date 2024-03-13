import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo ba tam giác
        Triangle triangle1 = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Triangle triangle2 = new Triangle(0, 0, 3, 0, 0, 4);
        Triangle triangle3 = new Triangle(new Point(3, 0), new Point(6, 0), new Point(3, 4));

        // Tạo một danh sách các tam giác và thêm tam giác vào danh sách
        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle1);
        triangles.add(triangle2);
        triangles.add(triangle3);

        // In ra thông tin của từng tam giác và tính chu vi
        for (int i = 0; i < triangles.size(); i++) {
            Triangle triangle = triangles.get(i);
            System.out.println("Triangle " + (i + 1) + ":");
            System.out.println("Perimeter: " + triangle.getPerimeter());
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {
    Point vertice1;
    Point vertice2;
    Point vertice3;

    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertice1 = new Point(x1, y1);
        this.vertice2 = new Point(x2, y2);
        this.vertice3 = new Point(x3, y3);
    }

    public double getPerimeter() {
        double side1 = Math.sqrt(Math.pow(vertice2.x - vertice1.x, 2) + Math.pow(vertice2.y - vertice1.y, 2));
        double side2 = Math.sqrt(Math.pow(vertice3.x - vertice2.x, 2) + Math.pow(vertice3.y - vertice2.y, 2));
        double side3 = Math.sqrt(Math.pow(vertice1.x - vertice3.x, 2) + Math.pow(vertice1.y - vertice3.y, 2));
        return side1 + side2 + side3;
    }