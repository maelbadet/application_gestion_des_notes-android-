package gestion.de.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class AjouteNoteActivity extends AppCompatActivity {
    private Spinner spinnerElv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoute_note);

        this.spinnerElv = (Spinner) findViewById(R.id.spinner);

        //Ajouter des élèves ( pour l'exemple)
        Eleves elv1 = new Eleves(13, "Jean", "Philippe", "13 mars 2565");
        Eleves elv2 = new Eleves(13, "Jeannie", "Philippine", "31 mars 2565");
        ElevesDAO.addEleve(elv1);
        ElevesDAO.addEleve(elv2);


        // Récupération ArrayEleves (nécessite une méthode getEleves() )
        ArrayList<Eleves> eleves = ElevesDAO.getEleves();


        // Creation de l'adapter Array
        ArrayAdapter<Eleves> adapter = new ArrayAdapter<Eleves>(this, android.R.layout.simple_spinner_item, eleves);

        //Attribution de l'adapter au spinner
        this.spinnerElv.setAdapter(adapter);

        //Selection d'un item
        this.spinnerElv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void ontItemSelectedHandler(AdapterView<?> adapterView, View view, int position, long id) {
        Adapter adapter = adapterView.getAdapter();
        Eleves eleves = (Eleves) adapter.getItem(position);
    }
}