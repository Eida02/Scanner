bpackage com.example.user.bc;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import static com.example.user.bc.R.menu.navigation_menu;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout nd;
    private ActionBarDrawerToggle nT;
    private MenuItem ni;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nd=(DrawerLayout) findViewById(R.id.drawar_layout);
        nT= new ActionBarDrawerToggle(this,nd,R.string.open,R.string.close);

        nd.addDrawerListener(nT);
        nT.syncState();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(nT.onOptionsItemSelected(item))
        {
           return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
