package constructor;

public class Car {

    private String modelName;
    private double price;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public Car(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
