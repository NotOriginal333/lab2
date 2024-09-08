package task3;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Shelf shelf1 = new Shelf(100, 50, 50, 5);
        Shelf shelf2 = new Shelf(200, 100, 100, 5);

        warehouse.addShelf(shelf1);
        warehouse.addShelf(shelf2);

        Product product1 = new Product("Product1", 30, 20, 10);
        Product product2 = new Product("Product2", 50, 40, 20);
        Product product3 = new Product("Product3", 70, 60, 30);
        Product product4 = new Product("Product4", 40, 30, 20);
        Product product5 = new Product("Product5", 10, 10, 10);
        Product product6 = new Product("Product6", 80, 70, 40);

        warehouse.storeProduct(product1);
        warehouse.storeProduct(product2);
        warehouse.storeProduct(product3);
        warehouse.storeProduct(product4);
        warehouse.storeProduct(product5);
        warehouse.storeProduct(product6);

        warehouse.printInventory();
    }
}
