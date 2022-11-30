package gestion.de.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

        public class NotesActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                RecyclerView monRecycler = findViewById(R.id.listeEleves);
                monRecycler.setAdapter( new AdapterNotes() );
            }
        }