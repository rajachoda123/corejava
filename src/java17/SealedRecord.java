package java17;
//constructor
//getter, setter
//toString, hashcode, equals
public record SealedRecord() {
    public static void main(String[] args) {
        Room room = new Room(1,"Sai");
        Room room1 = new Room(1,"Sai");
       // System.out.println(room + "--" +room1);
        if( room.equals(room1) ) System.out.println( "equal");
        else System.out.println("not equal");
        // test sealed classes here
        Shape circle = new Circle();
        System.out.println(circle.area());
        Shape rectangle = new Recatangle(10,20);
        System.out.println(rectangle.area());

    }
}
record Room(long id, String name) {
}
sealed interface Shape permits Circle,Recatangle {
    public double area();
}
final class Circle implements Shape {
  private int radius = 2;
    @Override
    public double area() {
        return 3.14 * radius *radius ;
    }
}
record Recatangle(int length, int breadth) implements Shape {
 @Override
 public double area() {
     return length * breadth;
 }
}

