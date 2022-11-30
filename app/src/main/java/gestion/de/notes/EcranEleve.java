package gestion.de.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EcranEleve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_eleve);

        Button bouton = findViewById(R.id.boutonConnexion);
    }

    public void onClick(View view) {
        Log.d("EcranEleve", "Debut-onClick");

        TextView identifiant = (EditText) findViewById(R.id.saisie1);
        TextView nom = (EditText) findViewById(R.id.saisie2);
        TextView prenom = (EditText) findViewById(R.id.saisie3);
        TextView dateNaissance = (EditText) findViewById(R.id.saisie4);

        int champ1 = Integer.parseInt(identifiant.getText().toString());
        String champ2 = nom.getText().toString();
        String champ3 = prenom.getText().toString();
        String champ4 = dateNaissance.getText().toString();

        Toast.makeText(getApplicationContext(), "L'identifiant " + champ1 + " a été renseignée", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Le nom " + champ2 + " a été renseignée", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Le prenom " + champ3 + " a été renseignée", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "La date de naissance " + champ4 + " a été renseignée", Toast.LENGTH_SHORT).show();

        Eleves elevetest = new Eleves(champ1,champ2,champ3,champ4);
        ElevesDAO.addEleve(elevetest);

    }
}







