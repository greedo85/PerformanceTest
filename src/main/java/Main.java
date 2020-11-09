import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Utilities utilities;
        char choice;
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
                            utilities = new Utilities(100000);
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
                            utilities = new Utilities(100000);
                            remove(utilities);
                            break;
                    }
                    break;
            }

        }
        while (choice != 'q');
    }

    private static void Menu() {
        System.out.println("d - Przestestuj szybkość dodawania dla:");
        System.out.println("1 - 1000 obiektów");
        System.out.println("2 - 10000 obiektów");
        System.out.println("3 - 100000 obiektów");
        System.out.println("u - Przetestuj szybość usuwania dla: ");
        System.out.println("1 - 1000 obiektów");
        System.out.println("2 - 10000 obiektów");
        System.out.println("3 - 100000 obiektów");
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
}
