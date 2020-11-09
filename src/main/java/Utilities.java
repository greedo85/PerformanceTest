import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class Utilities {

    Person[] people;
    List<Person> peopleArrayList = new ArrayList<>();
    List<Person> peopleLinkedList = new LinkedList<>();
    Set<Person> peopleHashSet = new HashSet<>();
    Set<Person> peopleLikedHashSet = new LinkedHashSet<>();
    Set<Person> peopleTreeSet = new TreeSet<>();
    private long start;
    private long end;
    private long total;
    int number;
    public Utilities( int number ) {
        this.number = number;
        addToArray(number);
    }

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
        System.out.println("Czas dodawania "+people.length+" obiektów do "+collection.getClass()+" to: "+total+" ms");
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
        System.out.println("Czas pobrania "+person+" z "+collection.getClass()+" to: "+total+" ms");
        return null;
    }

    public void removeAllFromCollection( Collection<Person> collection ) {
        start = System.nanoTime();
        collection.removeAll(Arrays.asList(people));
        end = System.nanoTime();
        total = end - start;
        System.out.println("Czas usuwania "+people.length+" obiektów do "+collection.getClass()+" to: "+total+" ms");
    }
    public void removeOneFromCollection(Collection<Person>collection,Person person)
    {
        start = System.nanoTime();
        for (Person p : collection) {
            if (p.equals(person)) {
                collection.remove(p);
            }
        }
        end = System.nanoTime();
        total = end - start;
        System.out.println("Czas usunięcia "+person+" z "+collection.getClass()+" to: "+total+" ms");
    }
}
