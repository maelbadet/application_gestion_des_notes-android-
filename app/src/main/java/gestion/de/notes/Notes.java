package gestion.de.notes;

public class Notes {

    //Initialisation des variables
    int id;
    String codeDevoir;
    int note;
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;

    //constructeur note
    public Notes(int id, String codeDevoir, int note, int n1,
                 int n2, int n3, int n4, int n5){
        this.id = id;
        this.codeDevoir = codeDevoir;
        this.note = note;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

}
