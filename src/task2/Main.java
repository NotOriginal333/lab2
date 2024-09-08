package task2;

public class Main {
    public static void main(String[] args) {
        Shape2D triangle = new Triangle(3, 4);
        Shape2D square = new Square(5);
        Shape3D cube = new Cube(3);
        Shape3D sphere = new Sphere(2);
        Shape3D pyramid = new Pyramid(4, 4, 6);

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Cube area: " + cube.getArea());
        System.out.println("Cube volume: " + cube.getVolume());
        System.out.println("Sphere area: " + sphere.getArea());
        System.out.println("Sphere volume: " + sphere.getVolume());
        System.out.println("Pyramid area: " + pyramid.getArea());
        System.out.println("Pyramid volume: " + pyramid.getVolume());
    }
}
