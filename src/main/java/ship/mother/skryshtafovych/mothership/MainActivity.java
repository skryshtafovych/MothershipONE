package ship.mother.skryshtafovych.mothership;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;

import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildBigger;
    private Button xyzReader;
    private Button capStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        scoresApp = (Button) findViewById(R.id.scoresApp);
        libraryApp = (Button) findViewById(R.id.libraryApp);
        buildBigger = (Button) findViewById(R.id.buildBigger);
        xyzReader = (Button) findViewById(R.id.xyzReader);
        capStone = (Button) findViewById(R.id.capStone);

        spotifyStreamer.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Spotify-Streamer App was clicked", Toast.LENGTH_LONG).show();

            }
        });
        scoresApp.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Scores App was clicked", Toast.LENGTH_LONG).show();

            }
        });
        libraryApp.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Library App was clicked", Toast.LENGTH_LONG).show();

            }
        });
        buildBigger.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Build Bigger App was clicked", Toast.LENGTH_LONG).show();

            }
        });
        xyzReader.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "XYZ Reader was clicked", Toast.LENGTH_LONG).show();

            }
        });
        capStone.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "capStone App was clicked", Toast.LENGTH_LONG).show();

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
