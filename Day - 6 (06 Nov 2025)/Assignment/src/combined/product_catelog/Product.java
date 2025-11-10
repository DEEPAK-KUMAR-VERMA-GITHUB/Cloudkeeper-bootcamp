package combined.product_catelog;

import java.util.HashMap;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    private static final HashMap<Integer, Product> products;

    static {
        products = new HashMap<>();
    }

    public Product(int productId, String productName, double productPrice) {
        if (products.containsKey(productId)) {
            throw new IllegalArgumentException("Duplicate product id : " + productId);
        }
        if (productPrice < 0) {
            throw new NegativePriceException("Price can't be negative.");
        }

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        products.put(productId, this);
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public static HashMap<Integer, Product> getProducts() {
        return products;
    }

    public void setProductId(int productId) {
        if (this.productId == productId || products.containsKey(productId)) {
            throw new IllegalArgumentException("Duplicate product id : " + productId);
        }
        products.remove(this.productId);
        this.productId = productId;
        products.put(productId, this);
    }

    public void setProductName(String productName) {
        this.productName = productName;
        products.put(this.productId, this);
    }

    public void setProductPrice(double productPrice) {
        if (productPrice < 0) {
            throw new NegativePriceException("Price can't be negative.");
        }
        this.productPrice = productPrice;
        products.put(this.productId, this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
