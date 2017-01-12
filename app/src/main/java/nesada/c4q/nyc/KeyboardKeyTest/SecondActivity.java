package nesada.c4q.nyc.KeyboardKeyTest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import nesada.c4q.nyc.imagetest.R;


/**
 * Created by nesadakoca on 1/11/17.
 */

public class SecondActivity extends AppCompatActivity {
    public static final String URL = "url";
    private int back = 1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

    }

    @Override
    public void onBackPressed(){
        if(back == 2){
            finish();
        } else {
            Toast.makeText(this, "Press once more to see list", Toast.LENGTH_SHORT).show();
            back ++;
        }
    }
}