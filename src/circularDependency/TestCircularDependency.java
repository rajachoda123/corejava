package circularDependency;

public class TestCircularDependency {

    public static void main(String[] args) {
        Car car = new Car();
        Engine e = new Engine();
        //circular dependency
        car.setEngine(e);
        e.setCar(car); 
        System.out.println("hello");
    }
}
