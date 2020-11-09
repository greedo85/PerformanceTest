import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner =new Scanner(System.in);
        Utilities utilities;
        int choice;
        do {
            System.out.println("Przestestuj szybkość dodawania dla:" );
            System.out.println("1 - 1000 obiektów");
            System.out.println("2 - 10000 obiektów");
            System.out.println("3 - 100000 obiektów");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    utilities=new Utilities(1000);
                    add(utilities);
                    break;

            }

        }
        while(choice!=-1);
    }

    private static void add( Utilities utilities ) {
        utilities.addToCollection(utilities.peopleArrayList);
        utilities.addToCollection(utilities.peopleLikedHashSet);
        utilities.addToCollection(utilities.peopleLinkedList);
        utilities.addToCollection(utilities.peopleHashSet);
    }
}
