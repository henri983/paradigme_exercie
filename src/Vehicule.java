public abstract class Vehicule {
    private String marque;
    private String modele;
    protected int vitesseMax; // CORRIGÉ : M majuscule pour correspondre aux normes Java
    private static int nbVehicules = 0;

    // Constructeur par défaut
    public Vehicule() {
        this.marque = "Inconnu";
        this.modele = "Inconnu";
        this.vitesseMax = 0; // CORRIGÉ : vitesseMax
        nbVehicules++;
    }

    // Constructeur paramétré
    public Vehicule(String marque, String modele, int vitesseMax) {
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax; // CORRIGÉ : vitesseMax
        nbVehicules++;
    }

    // Getters & Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public static int getNbVehicules() {
        return nbVehicules;
    }

    public static void setNbVehicules(int nbVehicules) {
        Vehicule.nbVehicules = nbVehicules;
    }

    public int getVitesseMax() { // CORRIGÉ : getVitesseMax
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) { // CORRIGÉ : setVitesseMax
        this.vitesseMax = vitesseMax;
    }

    // Méthodes
    public void afficherInfos(){ // CORRIGÉ : I majuscule pour respecter la structure du Main
        System.out.println("Marque : " + marque + ", Modèle : " + modele + ", Vitesse max : " + vitesseMax + " km/h");
    }

    public abstract void demarrer();

    public void rouler(){
        System.out.println("Le véhicule roule.");
    }

    public static void afficherNbVehicules(){
        System.out.println("Nombre total de véhicules créés : " + nbVehicules);
    }
}
