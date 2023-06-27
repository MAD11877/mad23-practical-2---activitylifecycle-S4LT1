package sg.edu.np.mad_wk2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE,"On Start!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE,"On Pause!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE,"On Resume!");


    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE,"On Stop!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE,"On Destroy!");
    }
}