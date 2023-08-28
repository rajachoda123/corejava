package beforeLambda;

public class Person {
    private String name;
    private Sex gender;

    public Sex getGender() {
        return gender;
    }
    public void setGender(Sex gender) {
        this.gender = gender;
    }
     public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 0;
    }


    public Person(String name, int age) {
        this.name = name;
    }
}
