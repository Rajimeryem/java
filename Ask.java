import java.util.Scanner;
public class Ask{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer votre nom : ");
        String nom = scanner.nextLine();

        System.out.println("Bonjour, " + nom + "!");
        scanner.close();
    }
}