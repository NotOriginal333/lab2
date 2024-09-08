package task3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Shelf> shelves;

    public Warehouse() {
        this.shelves = new ArrayList<>();
    }

    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    public void storeProduct(Product product) {
        for (Shelf shelf : shelves) {
            try {
                shelf.addProduct(product);
                System.out.println("Product stored: " + product);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("No suitable shelf found for product: " + product);
    }

    public void printInventory() {
        for (Shelf shelf : shelves) {
            System.out.println(shelf);
            for (Product product : shelf.getProducts()) {
                System.out.println("  " + product);
            }
        }
    }
}
