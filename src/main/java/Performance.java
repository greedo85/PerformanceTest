public class Performance {

    Utilities utilities;
    private long start;
    private long end;
    private long total;

    public Performance() {
        utilities = new Utilities();

    }

    public void addToHashSetTime( int number ) {
        utilities.addToArray(number);
        start = System.nanoTime();
        utilities.addToCollection(utilities.peopleHashSet);
        end = System.nanoTime();
        total = end - start;
        System.out.println("Czas dodawania " + number + " obiektów Person do HashSet to:" + total + " ms");
        addToLinkedListTime(number);

    }

    public void addToLinkedListTime( int number ) {
        start = System.nanoTime();
        utilities.addToCollection(utilities.peopleLinkedList);
        end = System.nanoTime();
        total = end - start;
        System.out.println("Czas dodawania " + number + " obiektów Person do LinkedList to:" + total + " ms");
    }
    public void addToArrayListTime(int number)
    {
        start = System.nanoTime();
        utilities.addToCollection(utilities.peopleArrayList);
        end = System.nanoTime();
        total = end - start;
        System.out.println("Czas dodawania " + number + " obiektów Person do ArrayList to:" + total + " ms");
    }

}
