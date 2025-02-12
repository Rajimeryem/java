package Etudiant;
import java.util.*;

public class GestionEtudiant {
    private ArrayList<Etudiant> listeEtudiants;

    public GestionEtudiant() {
        this.listeEtudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(String nom) {
        listeEtudiants.add(new Etudiant(nom));
        System.out.println(nom + " a été ajouté.");
    }

    public void afficherEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Etudiant e : listeEtudiants) {
                System.out.println("- " + e.getNom());
            }
        }
    }

    public void supprimerEtudiant(String nom) {
        Iterator<Etudiant> iterator = listeEtudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant e = iterator.next();
            if (e.getNom().equalsIgnoreCase(nom)) {
                iterator.remove();
                System.out.println(nom + " a été supprimé.");
                return;
            }
        }
        System.out.println("Étudiant " + nom + " non trouvé.");
    }
}
