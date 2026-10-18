public class Camion extends Vehicule {
    private int capacite; // en tonnes

    public Camion(String marque, String modele, int vitesseMax, int capacite) {
        super(marque, modele, vitesseMax);
        this.capacite = capacite;
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion met du temps à démarrer.");
    }

    @Override
    public void rouler() {
        System.out.println("Le camion transporte une charge.");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Capacité de charge : " + capacite + " tonnes");
    }
}
