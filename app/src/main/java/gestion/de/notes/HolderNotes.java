package gestion.de.notes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderNotes extends RecyclerView.ViewHolder {

    private TextView nom;
    private TextView prenom;
    private TextView dateNaissance;
    private TextView codeDevoir;
    private TextView note;

    public HolderNotes(@NonNull View itemView) {
        super(itemView);
        nom = itemView.findViewById(R.id.nom);
        prenom = itemView.findViewById(R.id.prenom);
        dateNaissance = itemView.findViewById(R.id.dateNaissance);
        codeDevoir = itemView.findViewById(R.id.codeDevoir);
        note = itemView.findViewById(R.id.note);
        //lg = itemView.findViewById(R.id.laLigne);
    }

    public void setNom(TextView nom) {
        this.nom = nom;
    }

    public void setPrenom(TextView prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(TextView dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setCodeDevoir(TextView codeDevoir) {
        this.codeDevoir = codeDevoir;
    }

    public void setNote(TextView note) {
        this.note = note;
    }
}
