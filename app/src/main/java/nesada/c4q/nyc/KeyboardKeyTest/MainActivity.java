package nesada.c4q.nyc.KeyboardKeyTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nesada.c4q.nyc.imagetest.R;
/**
 * Created by nesadakoca on 1/11/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            return;
        }
        getSupportFragmentManager().beginTransaction()
                .add(R.id.holder,new MainFragment())
                .commit();
    }
}
