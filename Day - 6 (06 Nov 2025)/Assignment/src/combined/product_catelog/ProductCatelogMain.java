package combined.product_catelog;

public class ProductCatelogMain {
    public static void main(String[] args) {
        try {
            Product product1 = new Product(101, "Laptop", 799.99);
            Product product2 = new Product(102, "Smartphone", 499.99);
            Product product3 = new Product(103, "Headphones", 89.99);
            Product product4 = new Product(104, "Smartwatch", 199.99);

            // Print all products
            System.out.println("All Products:");
            for (Product product : Product.getProducts().values()) {
                System.out.println(product);
            }

            // Modify products
            product1.setProductPrice(749.99);  // Update price
            product2.setProductName("Smartphone Pro");  // Update name
            product3.setProductId(105);  // Update ID

            System.out.println("\nUpdated Products:");
            for (Product product : Product.getProducts().values()) {
                System.out.println(product);
            }

        } catch (NegativePriceException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
