public class Performance {

    Utilities utilities;
    int number;

    public Performance( int number ) {
        this.number = number;
        utilities = new Utilities();
        utilities.addToArray(number);
    }

    public void addToHashSetTime() {
        utilities.addToCollection(utilities.peopleHashSet);
        System.out.println("Czas dodawania " + number + " obiektów Person do HashSet to:" + utilities.getTotal() + " ms");
    }

    public void addToLinkedListTime() {
        utilities.addToCollection(utilities.peopleLinkedList);
        System.out.println("Czas dodawania " + number + " obiektów Person do LinkedList to:" + utilities.getTotal() + " ms");
    }

    public void addToArrayListTime() {

        utilities.addToCollection(utilities.peopleArrayList);
        System.out.println("Czas dodawania " + number + " obiektów Person do ArrayList to:" + utilities.getTotal() + " ms");
    }

}
