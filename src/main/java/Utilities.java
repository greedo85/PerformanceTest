import lombok.Getter;

import java.util.*;

@Getter
public class Utilities {

    Person[] people;
    List<Person> peopleArrayList = new ArrayList<>();
    List<Person> peopleLinkedList = new LinkedList<>();
    Set<Person> peopleHashSet = new HashSet<>();
    Set<Person> peopleLikedHashSet = new LinkedHashSet<>();
    private long start;
    private long end;
    private long total;

    public Person generatePerson() {
        String name = "";
        String surname = "";
        for (int j = 0; j < 5; j++) {
            int min1 = 65;
            int max1 = 90;
            int min2 = 48;
            int max2 = 57;
            name += (char) (min1 + (int) (Math.random() * ((max1 - min1) + 1)));
            name += (char) (min2 + (int) (Math.random() * ((max2 - min2) + 1)));
            surname += (char) (min1 + (int) (Math.random() * ((max1 - min1) + 1)));
            surname += (char) (min2 + (int) (Math.random() * ((max2 - min2) + 1)));
        }
        return new Person(name, surname);
    }

    public void addToArray( int number ) {
        people = new Person[number];
        for (int i = 0; i < people.length; i++) {
            people[i] = generatePerson();
        }
    }

    public void addToCollection( Collection collection ) {
        start = System.nanoTime();
        collection.addAll(Arrays.asList(people));
        end = System.nanoTime();
        total = end - start;
    }

    public Person getFromCollection( Person person, Collection<Person> collection ) {
        start = System.nanoTime();
        for (Person p : collection) {
            if (p.equals(person)) {
                return p;
            }
        }
        end = System.nanoTime();
        total = end - start;
        return null;
    }
}
