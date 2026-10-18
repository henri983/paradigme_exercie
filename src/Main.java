import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("Hello and welcome! Début du TP Garage."));

        // Étape 5 : Création de la liste polymorphe
        List<Vehicule> garage = new ArrayList<>();

        garage.add(new Voiture("Peugeot", "208", 180, 5));
        garage.add(new Moto("Yamaha", "MT-07", 200, 689));
        garage.add(new Camion("Volvo", "FH16", 90, 44));

        // Étape 7 : Test de la surcharge de constructeur
        garage.add(new Voiture("Renault", "Clio"));

        // Étape 8 : Ajout du Bus (Défi)
        garage.add(new Bus("Mercedes", "Citaro", 85));

        System.out.println("\n--- ÉTAPE 5 : Polymorphisme dynamique ---");
        for (Vehicule v : garage) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code.
            v.afficherInfos();
            v.demarrer();
            v.rouler();
            System.out.println("----------------------------------------");
        }

        System.out.println("\n--- ÉTAPE 6 : Méthodes spécifiques ---");
        for (Vehicule v : garage) {
            System.out.print("[" + v.getMarque() + " " + v.getModele() + "] : ");

            if (v instanceof Voiture) {
                Voiture maVoiture = (Voiture) v;
                maVoiture.klaxonner();
            } else if (v instanceof Moto) {
                ((Moto) v).faireWheeling();
            } else if (v instanceof Bus) {
                ((Bus) v).prendrePassagers(12);
            } else {
                System.out.println("Aucune action spécifique pour ce véhicule.");
            }
        }

        System.out.println("\n--- ÉTAPE 7 : Compteur statique ---");
        Vehicule.afficherNbVehicules();
    }
}
