import lombok.Getter;

import java.util.Collection;

@Getter
public class Utilities {

    Person[] people;

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
        System.out.println("name:" + name);
        System.out.println("surname:" + surname);
        return new Person(name, surname);
    }

    public void addToArray ( int number )
    {
        people = new Person[number];
        for (int i = 0; i < people.length; i++) {
            people[i] = generatePerson();
        }
    }

    public void addToCollection( Collection collection ) {
        for (int i = 0; i < people.length; i++) {
            collection.add(people[i]);
        }
    }
}
