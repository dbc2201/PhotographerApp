package in.ac.gla.miniProject.Photographer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ProgressBar;

class firstPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        Boolean isFirstTime;


        SharedPreferences app_preferences = PreferenceManager
                .getDefaultSharedPreferences(firstPage.this);


        SharedPreferences.Editor editor = app_preferences.edit();

        isFirstTime = app_preferences.getBoolean("isFirstTime", true);


        if (isFirstTime) {

            Intent intent = new Intent(firstPage.this,MainActivity.class);
            startActivity(intent);

//implement your first time logic
            editor.putBoolean("isFirstTime", false);
            editor.commit();

        }else{

            Intent intent = new Intent(firstPage.this,Splash.class);
            startActivity(intent);
//app open directly
        }
    }
}


