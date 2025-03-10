import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice Java!");

        while (true) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice. Au revoir!");
                break;
            }

            System.out.println("Entrez le premier nombre :");
            double a = scanner.nextDouble();

            System.out.println("Entrez le deuxième nombre :");
            double b = scanner.nextDouble();

            try {
                switch (choix) {
                    case 1:
                        System.out.println("Résultat de l'addition : " + calculatrice.addition(a, b));
                        break;
                    case 2:
                        System.out.println("Résultat de la soustraction : " + calculatrice.soustraction(a, b));
                        break;
                    case 3:
                        System.out.println("Résultat de la multiplication : " + calculatrice.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println("Résultat de la division : " + calculatrice.division(a, b));
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez choisir une option entre 1 et 5.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Erreur : " + e.getMessage());
            }

            System.out.println(); // Pour une meilleure lisibilité
        }

        scanner.close();
    }
}