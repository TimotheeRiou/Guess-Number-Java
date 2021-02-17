import java.util.Scanner;
import java.util.Random;


public class Jeu {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var tentatives = 10;

        System.out.println("Bienvenue dans la Matrice");

        while (true) {
            System.out.println("\n1. Jouer.");
            System.out.println("2. Choisir la difficulté (" + tentatives + " tentatives).");
            System.out.println("3. Quiter.\n");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    Random rand = new Random();
                    int randomInteger;
                    randomInteger = rand.nextInt(10) + 1;

                    var nombreDeTentatives  = tentatives;
                    System.out.println("Deviner le nombre entre 0 et 100 !");
                    while (nombreDeTentatives > 0) {
                        System.out.println(nombreDeTentatives-- + " tentatives restantes:");
                        var input = Integer.parseInt(scanner.nextLine());
                        if (input == randomInteger)
                            break;
                        else
                            System.out.println("Le nombre est" + (input < randomInteger ? " plus grand" : " plus petit"));
                    }
                    if (nombreDeTentatives > 0)
                        System.out.println("C'est gagné");
                    else {
                        System.out.println("Perdu");
                        System.out.println("Le nombre était " + randomInteger);
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Choisir un nombre d'essais:");
                        int newAttempts = Integer.parseInt(scanner.nextLine());
                        if (newAttempts > 0) {
                            tentatives = newAttempts;
                            break;
                        } else
                            System.out.println("Le nombre d'essais doit être supérieur à 0 !");
                    }
                    break;

                case 3:
                    System.out.println("Quiter");
                    return;
            }
        }
    }
}