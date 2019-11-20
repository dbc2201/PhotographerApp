package in.ac.gla.miniProject.Photographer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Main3Activity extends AppCompatActivity {
    Button btn,btnn;

    TextView t1;
    Handler handler;
    double lat = 13;
    double lon = 13;
    Geocoder geocoder;
    List<Address> addresses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        t1 = findViewById(R.id.text);
        btnn=findViewById(R.id.btnn);

        geocoder = new Geocoder(this, Locale.getDefault());
        btn = findViewById(R.id.btn);
        ActivityCompat.requestPermissions(Main3Activity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 123);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gpstracker g = new gpstracker(getApplicationContext());
                Location location = g.getlocation();
                handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                        startActivity(intent);
                        finish();
                    }
                },4000);
                if (location != null) {
                    double lat = location.getLatitude();
                    double lon = location.getLatitude();
                    Toast.makeText(getApplicationContext(), "LAT: " + lat + "\n LON : " + lon, Toast.LENGTH_LONG).show();
                    try {
                        addresses = geocoder.getFromLocation(lat, lon, 1);
                        String address = addresses.get(0).getAddressLine(0);
                        String area = addresses.get(0).getLocality();
                        String city = addresses.get(0).getAdminArea();
                        String country = addresses.get(0).getCountryCode();
                        String postalcode = addresses.get(0).getPostalCode();
                        String fullAddress = address + ", " + area + "," + city + "," + country + "," + postalcode;
                        t1.setText(fullAddress);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}
