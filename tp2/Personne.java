import java.util.Scanner;

public class Personne {
    private int cin;
    private String nom;
    private String prenom;
    private String address;
    private int age;

    public Personne(int cin, String nom, String prenom, String address, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
        this.age = age;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficher() {
        System.out.println("CIN : " + cin);
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Adresse : " + address);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Ajouter une personne");
        System.out.println("2. Quitter");
        System.out.print("Votre choix : ");

        int choix = sc.nextInt();
        sc.nextLine();

        if (choix == 1) {

            System.out.print("Donner le CIN : ");
            int cin = sc.nextInt();
            sc.nextLine();

            System.out.print("Donner le nom : ");
            String nom = sc.nextLine();

            System.out.print("Donner le prenom : ");
            String prenom = sc.nextLine();

            System.out.print("Donner l'adresse : ");
            String address = sc.nextLine();

            System.out.print("Donner l'age : ");
            int age = sc.nextInt();

            Personne p = new Personne(cin, nom, prenom, address, age);

            System.out.println("\n--- Informations ---");
            p.afficher();

        } else if (choix == 2) {

            System.out.println("Programme terminé.");

        } else {

            System.out.println("Choix invalide.");

        }

        sc.close();
    }
}
