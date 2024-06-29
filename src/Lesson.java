import model.VideoGame;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter genre: ");
        String genre = scanner.next();
        System.out.print("Enter Developer: ");
        scanner.nextLine();
        String developer = scanner.nextLine();
        System.out.print("Is game firstPerson: ");
        boolean firstPerson = scanner.nextBoolean();
        System.out.print("The year of the game: ");
        int releaseDateYear = scanner.nextInt();
        System.out.print("The month of the game: ");
        int releaseDateMonth = scanner.nextInt();
        System.out.print("Enter platform: ");
        String platform = scanner.next();

        VideoGame game1 = new VideoGame();
        game1.setName(name);
        game1.setGenre(genre);
        game1.setDeveloper(developer);
        game1.setFirstPerson(firstPerson);
        game1.setReleaseDateYear(releaseDateYear);
        game1.setReleaseDateMonth(releaseDateMonth);
        game1.setPlatform(platform);


        game1.printInfo();






//        VideoGame mortalKombat = new VideoGame();
//        mortalKombat.name = "Mortal Kombat";
//        mortalKombat.genre = "Fighting";
//        mortalKombat.developer = "NetherRealm studios";
//        mortalKombat.platforms = new String[]{"Xbox", "PlayStation", "Nintendo"};
//        mortalKombat.releaseDateYear = 2023;
//        mortalKombat.releaseDateMonth = 3;
//
//        VideoGame callOfDuty = new VideoGame();
//        callOfDuty.name = "Call of Duty";
//        callOfDuty.genre = "Shooter";
//        callOfDuty.developer = "Infinity Ward";
//        callOfDuty.platforms = new String[]{"Xbox", "Windows", "PlayStation"};
//        callOfDuty.firstPerson = true;
//        callOfDuty.releaseDateYear = 2019;
//        callOfDuty.releaseDateMonth = 9;
//
//
//        System.out.println(mortalKombat.info());
//        System.out.println(callOfDuty.info());


    }
}
