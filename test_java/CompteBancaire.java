public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;
    public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }
    public static int getNombreComptes() {
        return nombreComptes;
    }
    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Depot de " + montant + " TND effectue sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Erreur : le montant du depot doit etre superieur a 0.");
        }
    }
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectue sur le compte " + numeroCompte + ".");
        } else if (montant > solde) {
            System.out.println("Echec : Solde insuffisant sur le compte " + numeroCompte + " (Solde actuel : " + solde + " TND).");
        } else {
            System.out.println("Erreur : le montant du retrait doit etre superieur a 0.");
        }
    }
    public void virement(CompteBancaire destination, double montant) {
        System.out.println("\nTentative de virement de " + montant + " TND vers le compte " + destination.getNumeroCompte() + "...");
        retirer(montant);
        if (solde >= 0) {
            destination.deposer(montant);
            System.out.println("Virement reussi !");
        }
    }
    public void afficherDetails() {
        System.out.println("Compte N° : " + numeroCompte);
        System.out.print("Titulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}
