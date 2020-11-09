import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    @Test
    public void addToCollectionTest() {
        //given
        Utilities utilities = new Utilities(100);

        //when

        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.addToCollection(utilities.peopleArrayList);
        //then
        assertEquals(100, utilities.peopleArrayList.size());
        assertEquals(100, utilities.peopleHashSet.size());
        assertEquals(100, utilities.peopleLinkedList.size());
    }

    @Test
    public void getFromCollectionTest() {
        //given
        Utilities utilities = new Utilities(100);

        //when
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.getFromCollection(utilities.people[1], utilities.peopleHashSet);

        //then
        assertTrue(utilities.peopleHashSet.contains(utilities.people[1]));
    }

    @Test
    public void removeFromCollectionTest() {
        //given
        //given
        Utilities utilities = new Utilities(100);

        //when

        utilities.addToCollection(utilities.peopleHashSet);
        utilities.removeFromCollection(utilities.peopleHashSet);
        //then
        assertFalse(utilities.peopleHashSet.contains(utilities.people[1]));
    }
}
