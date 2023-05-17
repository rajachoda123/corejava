public record RecordTest(String name, int age) {

    public static void main(String[] args) {
        RecordTest  r1 = new RecordTest ("raja", 15);
        RecordTest r2 = new RecordTest("raja", 15);
        System.out.println(r1.equals(r2));

        EqualsTest e1 = new EqualsTest("raja", 15);
        EqualsTest e2= new EqualsTest("raja", 15);

        System.out.println(e1.equals(e2));
    }
}

class EqualsTest {
    private String name;
    private int age;
    EqualsTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
