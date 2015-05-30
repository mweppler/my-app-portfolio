package me.weppler.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mProj1Btn;
    private Button mProj2Btn;
    private Button mProj3Btn;
    private Button mProj4Btn;
    private Button mProj5Btn;
    private Button mProj6Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();
        mProj1Btn = (Button) findViewById(R.id.spotify_streamer_button);
        mProj1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my spotify app!", Toast.LENGTH_SHORT).show();
            }
        });
        mProj2Btn = (Button) findViewById(R.id.scores_app_button);
        mProj2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my scores app!", Toast.LENGTH_SHORT).show();
            }
        });
        mProj3Btn = (Button) findViewById(R.id.library_app_button);
        mProj3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my library app!", Toast.LENGTH_SHORT).show();
            }
        });
        mProj4Btn = (Button) findViewById(R.id.build_it_bigger_button);
        mProj4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });
        mProj5Btn = (Button) findViewById(R.id.xyz_reader_button);
        mProj5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my xyz reader app!", Toast.LENGTH_LONG).show();
            }
        });
        mProj6Btn = (Button) findViewById(R.id.capstone_button);
        mProj6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
