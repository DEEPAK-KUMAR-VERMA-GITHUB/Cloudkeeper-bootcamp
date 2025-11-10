package static_keywords;

public class Counter {
    private static int counter = 0;

    public Counter(){
        counter++;
    }

    public static int getNumberOfInstances(){
        return counter;
    }

}
