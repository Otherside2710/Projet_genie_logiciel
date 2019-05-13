import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le programme de recherche de films");
        System.out.println("Que souhaitez vous rechercher ? (entrez un chiffre pour faire votre choix)");
        System.out.println("1) Rechercher un film");
        System.out.println("2) Rechercher un acteur");
        System.out.println("0) Quitter");


        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int choix;
        try {
            choix = Integer.parseInt(string);
        }
        catch (NumberFormatException e){
            choix = 0;
        }
        if (choix == 1) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("vous avz choisi film");
            System.out.println("Quel type de recherche voulez vous faire ?");
            System.out.println("1) Par titre");
            System.out.println("2) Par année ");
            System.out.println("3) Par pays");
            System.out.println("4) Par durée");

            String string1 = scanner1.nextLine();
            int choix1;
            try {
                choix1 = Integer.parseInt(string1);
            }
            catch (NumberFormatException e){
                choix1 = 0;
            }
            switch (choix1){
                case 1:
                    System.out.println("vous avez choisi une recherche par titre. Entrez le titre du film à rechercher.");
                    break;
                case 2:
                    System.out.println("Vous avez choisi une recherche par année. Entrez l'année de sortie du film à rechercher.");
                    break;
                case 3:
                    System.out.println("Vous avez choisi une recherche par pays. Entrez le pays d'origine du film à rechercher.");
                    break;
                case 4:
                    System.out.println("Vous avez choisi une recherche par durée. Entrez la durée du film à rechercher.");
                    break;
                default:
                    System.out.println("Saisie incorrecte");
            }

        } else if (choix == 2) {
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("vous avez choisi acteur");
            System.out.println("Quel type de recherche voulez vous faire ?");
            System.out.println("1) Par nom ");
            System.out.println("2) Par prénom");
            System.out.println("3) Par année de naissance");

            String string2 = scanner2.nextLine();
            int choix2;
            try {
                choix2 = Integer.parseInt(string2);
            }
            catch (NumberFormatException e){
                choix2 = 0;
            }
            switch (choix2){
                case 1:
                    System.out.println("Vous avez choisi une recherche par nom. Entrez le nom de l'acteur à rechercher.");
                    break;
                case 2:
                    System.out.println("Vous avez choisi une recherche par prénom. Entrez le prénom de l'acteur à rechercher.");
                    break;
                case 3:
                    System.out.println("Vous avez choisi une recherche par année de naissance. Entrez l'année de naissance de l'acteur à rechercher.");
                    break;
                default:
                    System.out.println("Saisie incorrecte");
                    break;
            }
        } else {
            System.out.println("Saisie incorrecte");
        }

    }
}
