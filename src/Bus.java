public class Bus extends Vehicule {
    private int nbPassagers;

    public Bus(String marque, String modele, int vitesseMax) {
        super(marque, modele, vitesseMax);
        this.nbPassagers = 0; // Initialisé à 0 par défaut
    }

    @Override
    public void demarrer() {
        System.out.println("Le bus démarre lourdement après fermeture des portes.");
    }

    @Override
    public void rouler() {
        System.out.println("Le bus suit son itinéraire de ligne.");
    }

    // Bonus : Méthode spécifique
    public void prendrePassagers(int n) {
        this.nbPassagers += n;
        System.out.println(n + " passager(s) monte(nt) à bord. Total : " + this.nbPassagers);
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre actuel de passagers : " + nbPassagers);
    }
}
