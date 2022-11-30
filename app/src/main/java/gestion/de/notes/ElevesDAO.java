package gestion.de.notes;

import java.util.ArrayList;

public class ElevesDAO {

    //on met toutes les variables dont on a besoin
    int note;


    //création d'un objet id qui prend le paramètre Eleve.id
    Eleves id = new Eleves();
    int ID = id.ID;

    //Création de la variabe note quipermettra de chercher le nombres de notes dans Eleve
    Eleves Note = new Eleves();
    int note1 = Note.n1;
    int note2 = Note.n2;
    int note3 = Note.n3;
    int note4 = Note.n4;
    int note5 = Note.n5;

    //création de la lsite eleves contenant tous les eleves
    static ArrayList<Eleves> eleves = new ArrayList<Eleves>();


    //création de la métohde addEleve qui permet d'ajouter un élève dans la lsite
    public static void addEleves(ArrayList<Eleves> eleves) {
        ElevesDAO.eleves = eleves;
    }
    public static void addEleve(Eleves eleves){
        ElevesDAO.eleves.add(eleves);
    }

    //création de la méthode getEleve pour la réception d'un élève est donc de l'affichage de celui-ci
    public static ArrayList<Eleves> getEleves() {
        return ElevesDAO.eleves;
    }

    //==============Mise en place de la récéption d'une note===================

    //on met le nom de l'Eleve en question
    public void setID(int id){
        this.ID = id;
    }

    //On ajotue sa note sur 20
    public void setNote(int laNote){
        this.note = laNote;
    }

    //on rentre sur quel plage elle se trouve de n1 à n5
    public void setNumeroNote(int n1, int n2, int n3, int n4, int n5){
        this.note1 = n1;
        this.note2 = n2;
        this.note3 = n3;
        this.note4 = n4;
        this.note5 = n5;

    }

}

