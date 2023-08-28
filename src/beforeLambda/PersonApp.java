package beforeLambda;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Sai",100);
        Person person1 = new Person("baba",200);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.sort((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

    }
    // 1. Traditional Approach
    public void printPersonsWithAgeRange(List<Person> people, int low,int high){
        for (Person person:people) {
            if(person.getAge()>low && person.getAge()<high){
                System.out.println(person);
            }
        }
    }
    // 2. interface way

}
