package beforeLambda;

public class AgeRestrictedPerson implements CheckPerson {
    @Override
    public boolean test(Person person) {
       /* return person.getGender == Person.Sex.Male &&
                person.getAge() > 18 &&
                person.getAge() < 50;
    }*/
        return true;
    }
}
