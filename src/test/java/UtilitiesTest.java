import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilitiesTest {

    @Test
    public void addToCollectionTest() {
        //given
        Utilities utilities = new Utilities();

        //when
        utilities.addToArray(100);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.addToCollection(utilities.peopleLinkedList);
        //then
        assertEquals(100, utilities.peopleArrayList.size());
        assertEquals(100, utilities.peopleHashSet.size());
        assertEquals(100, utilities.peopleLinkedList.size());
    }

    @Test
    public void getFromCollectionTest() {
        //given
        Utilities utilities = new Utilities();

        //when
        utilities.addToArray(100);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.getFromCollection(utilities.people[1], utilities.peopleHashSet);
        //then
        assertTrue(utilities.peopleHashSet.contains(utilities.people[1]));
    }
}
