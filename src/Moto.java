public class Moto extends Vehicule {
    private int cylindree;
// constructeur
    public Moto(String marque, String modele, int vitesseMax, int cylindree) {
        super(marque, modele, vitesseMax);
        this.cylindree = cylindree;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démarre avec le bouton électrique.");
    }

    public void faireWheeling() {
        System.out.println("La moto se cabre sur sa roue arrière ! Vroum !");
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Cylindrée : " + cylindree + " cc");
    }
}
