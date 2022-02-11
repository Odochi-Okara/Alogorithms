import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeApproachs {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Edochi",Gender.FEMALE),
                new Person("Samuel", Gender.MALE),
                new Person("Buso", Gender.FEMALE)
        );
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female:females) {
            System.out.println(female);
        }



        // DECLARATIVE
        List<Person>females2=people.
                stream().filter(person->person.name.startsWith("E")).collect(Collectors.toList());
        females2.forEach(System.out::println);
        System.out.println(females2.size());
    }


    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }

}
