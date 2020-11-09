import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Utilities utilities;
        char choice;
        int index;
        try {


            do {
                Menu();
                choice = scanner.next().charAt(0);
                switch (choice) {
                    case 'd':
                        choice = scanner.next().charAt(0);
                        switch (choice) {
                            case '1':
                                utilities = new Utilities(1000);
                                add(utilities);
                                break;
                            case '2':
                                utilities = new Utilities(10000);
                                add(utilities);
                                break;
                            case '3':
                                utilities = new Utilities(1000000);
                                add(utilities);
                                break;
                        }
                        break;
                    case 'u':
                        choice = scanner.next().charAt(0);
                        switch (choice) {
                            case '1':
                                utilities = new Utilities(1000);
                                removeAll(utilities);
                                break;
                            case '2':
                                utilities = new Utilities(10000);
                                removeAll(utilities);
                                break;
                            case '3':
                                utilities = new Utilities(1000000);
                                removeAll(utilities);
                                break;
                        }
                        break;
                    case 'p':
                        choice = scanner.next().charAt(0);
                        switch (choice) {
                            case '1':
                                utilities = new Utilities(1000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                pickOne(utilities, utilities.people[index]);
                                break;
                            case '2':
                                utilities = new Utilities(10000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                pickOne(utilities, utilities.people[index]);
                                break;
                            case '3':
                                utilities = new Utilities(1000000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                pickOne(utilities, utilities.people[index]);
                                break;
                        }
                        break;
                    case 'j':
                        choice = scanner.next().charAt(0);
                        switch (choice) {
                            case '1':
                                utilities = new Utilities(1000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                removeOne(utilities, utilities.people[index]);
                                break;
                            case '2':
                                utilities = new Utilities(10000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                removeOne(utilities, utilities.people[index]);
                                break;
                            case '3':
                                utilities = new Utilities(1000000);
                                System.out.println("Podaj index obiektu Person: ");
                                index = scanner.nextInt();
                                removeOne(utilities, utilities.people[index]);
                                break;
                        }
                        break;

                }

            }
            while (choice != 'q');
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poza zakresem");
        } catch (InputMismatchException e) {
            System.out.println("Zły wybór");
        }
    }

    private static void Menu() {
        System.out.println("d - Przestestuj szybkość dodawania dla:");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 1000000 obiektów");
        System.out.println("u - Przetestuj szybość usuwania wszystkich dla: ");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 1000000 obiektów");
        System.out.println("p - Przetestuj szybość pobrania jednego obiektu dla: ");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 1000000 obiektów");
        System.out.println("j - Przetestuj szybość usunięcia jednego obiektu dla: ");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 1000000 obiektów");
    }

    private static void add( Utilities utilities ) {
        utilities.addToCollection(utilities.peopleArrayList);
        utilities.addToCollection(utilities.peopleLikedHashSet);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.addToCollection(utilities.peopleTreeSet);
    }

    public static void removeAll( Utilities utilities ) {
        utilities.removeAllFromCollection(utilities.peopleArrayList);
        utilities.removeAllFromCollection(utilities.peopleLikedHashSet);
        utilities.removeAllFromCollection(utilities.peopleLinkedList);
        utilities.removeAllFromCollection(utilities.peopleHashSet);
        utilities.removeAllFromCollection(utilities.peopleTreeSet);
    }

    public static void removeOne(Utilities utilities, Person person)
    {
        utilities.removeOneFromCollection(utilities.peopleArrayList,person);
        utilities.removeOneFromCollection(utilities.peopleLikedHashSet,person);
        utilities.removeOneFromCollection(utilities.peopleLinkedList,person);
        utilities.removeOneFromCollection(utilities.peopleHashSet,person);
        utilities.removeOneFromCollection(utilities.peopleTreeSet,person);
    }

    public static void pickOne( Utilities utilities, Person person ) {
        utilities.getFromCollection(person, utilities.peopleArrayList);
        utilities.getFromCollection(person, utilities.peopleLikedHashSet);
        utilities.getFromCollection(person, utilities.peopleLinkedList);
        utilities.getFromCollection(person, utilities.peopleHashSet);
        utilities.getFromCollection(person, utilities.peopleTreeSet);
    }
}
