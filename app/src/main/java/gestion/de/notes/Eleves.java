package gestion.de.notes;

public class Eleves {

    // variable pour la création d'un élève
    int ID;
    String nom;
    String prenom;
    String dateNaissance;

    // variable pour le nombres de notes
    int note;
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;




    // On récupère un élève
    public Eleves(int id, String nom, String prenom, String dateNaissance) {
        this.ID = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Eleves() {
    }


    // récupération de tous les éléments pour un élève

    public int getID() {
        return ID;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getNote() {
        return note;
    }


    //Mise en place de tous les set pour les notes
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }
    public void setN4(int n4) {
        this.n4 = n4;
    }
    public void setN5(int n5) {
        this.n5 = n5;
    }
}








//=============================== test du code ==================================//

/*
                        //test nombre de notes avec une boucle for//
    int nbNotes = 1;
    public int nombreDeNotes(){
        for (int i =0; i<=5; i++){
            nbNotes++;
        }
        return nbNotes;
    }*/
