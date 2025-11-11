package constructor;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", 1036.60F);
        System.out.println(book1);

        Car car1 = new Car("Hyundai Creta EX(O) 1.5 Petrol ");
        Car car2 = new Car("Jeep Compass Longitude 2.0 Diesel Sandstorm Edition", 2112000);

        System.out.println(car1);
        System.out.println(car2);
    }
}
