package task2;

public class Pyramid extends Shape3D {
    private final double baseLength;
    private final double baseWidth;
    private final double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        double baseArea = baseLength * baseWidth;

        double apothemLength = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        double apothemWidth = Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(height, 2));

        double sideArea1 = (baseLength * apothemWidth) / 2;
        double sideArea2 = (baseWidth * apothemLength) / 2;

        return baseArea + 2 * (sideArea1 + sideArea2);
    }

    @Override
    public double getVolume() {
        double baseArea = baseLength * baseWidth;
        return (baseArea * height) / 3;
    }
}
