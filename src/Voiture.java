public class Voiture extends Vehicule {
    private int nbPortes;

    //constructeur

    public Voiture(String marque, String modele, int vitesseMax, int nbPortes) {
        super(marque, modele, vitesseMax);
        this.nbPortes = nbPortes;
    }
    // constructeur Static & surcharge
    public Voiture(String marque, String modele) {
        super(marque, modele, 120); // Valeurs par défaut : 120 km/h
        this.nbPortes = 5;            // Valeur par défaut : 5 portes
    }

    //redefinition de demarrer
    @Override
    public void demarrer(){
        System.out.println("La voiture démarre en tournant la clé.");
    }

    //methode
    public void klaxonner(){
        System.out.println("Bip bip !");
    }

    //redefinition de afficherinfos
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de portes : " + nbPortes);
    }
}
