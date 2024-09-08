package task3;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final double length;
    private final double width;
    private final double height;
    private final int capacity;
    private final List<Product> products;

    public Shelf(double length, double width, double height, int capacity) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public boolean canFit(Product product) {
        return length >= product.getLength() && width >= product.getWidth() &&
                height >= product.getHeight();
    }

    public void addProduct(Product product) throws Exception {
        if (!canFit(product)) {
            throw new Exception("Product does not fit in the shelf.");
        }
        if (products.size() >= capacity) {
            throw new Exception("Shelf is full. Cannot add more products.");
        }
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return String.format("Shelf{length=%.2f, width=%.2f, height=%.2f, capacity=%d}",
                length, width, height, capacity);
    }
}
