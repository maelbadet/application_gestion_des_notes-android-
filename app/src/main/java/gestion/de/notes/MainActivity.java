package gestion.de.notes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        actionBar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_lev:
                Intent launchactivity1 = new Intent(getApplicationContext(), EcranEleve.class);
                //Remplacer le getclass() par le nom de la class + ".class"
                startActivity(launchactivity1);
                return true;
            case R.id.add_note:
                Intent launchactivity2 = new Intent(getApplicationContext(), NotesActivity.class);
                //Remplacer le getclass() par le nom de la class + ".class"
                startActivity(launchactivity2);
                return true;
            case R.id.show_list:
                Intent launchactivity3 = new Intent(getApplicationContext(), AjouteNoteActivity.class);
                //Remplacer le getclass() par le nom de la class + ".class"
                startActivity(launchactivity3);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}