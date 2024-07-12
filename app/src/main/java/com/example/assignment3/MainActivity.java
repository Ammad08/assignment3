import android.R;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        toolbar = findViewById(R.id.tabs);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.redo);
        navigationView = findViewById(R.id.paste);

        // Setup ActionBarDrawerToggle with DrawerLayout
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.dialog_alert_title, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Handle navigation item clicks
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        // Handle navigation view item clicks here
                        int id = item.getItemId();

                        // Handle different navigation items here
                        if (id == R.id.paste) {
                            // Handle item 1 click
                        } else if (id == R.id.pasteAsPlainText) {
                            // Handle item 2 click
                        }

                        // Close the drawer when item is selected
                        drawerLayout.closeDrawers();
                        return true;
                    }
                });
    }
}
