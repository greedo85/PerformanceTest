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
                                remove(utilities);
                                break;
                            case '2':
                                utilities = new Utilities(10000);
                                remove(utilities);
                                break;
                            case '3':
                                utilities = new Utilities(1000000);
                                remove(utilities);
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
        System.out.println("3 - kolekcji 100000 obiektów");
        System.out.println("u - Przetestuj szybość usuwania dla: ");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 100000 obiektów");
        System.out.println("p - Przetestuj szybość pobrania jednego obiektu dla: ");
        System.out.println("1 - kolekcji 1000 obiektów");
        System.out.println("2 - kolekcji 10000 obiektów");
        System.out.println("3 - kolekcji 100000 obiektów");
    }

    private static void add( Utilities utilities ) {
        utilities.addToCollection(utilities.peopleArrayList);
        utilities.addToCollection(utilities.peopleLikedHashSet);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
        utilities.addToCollection(utilities.peopleTreeSet);
    }

    public static void remove( Utilities utilities ) {
        utilities.removeFromCollection(utilities.peopleArrayList);
        utilities.removeFromCollection(utilities.peopleLikedHashSet);
        utilities.removeFromCollection(utilities.peopleLinkedList);
        utilities.removeFromCollection(utilities.peopleHashSet);
        utilities.removeFromCollection(utilities.peopleTreeSet);
    }

    public static void pickOne( Utilities utilities, Person person ) {
        utilities.getFromCollection(person, utilities.peopleArrayList);
        utilities.getFromCollection(person, utilities.peopleLikedHashSet);
        utilities.getFromCollection(person, utilities.peopleLinkedList);
        utilities.getFromCollection(person, utilities.peopleHashSet);
        utilities.getFromCollection(person, utilities.peopleTreeSet);
    }
}
