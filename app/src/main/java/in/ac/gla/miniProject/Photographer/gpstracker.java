package in.ac.gla.miniProject.Photographer;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class gpstracker implements LocationListener {
    Context context;
    public gpstracker(Context c){
        context=c;
    }
public Location getlocation(){
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            Toast.makeText(context,"permission not granted",Toast.LENGTH_LONG).show();
            return null;
        }
    LocationManager lm =(LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    boolean isGpsEnabled =lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
    if(isGpsEnabled){
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,6000,1000,this);
        Location l =lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        return l;
    }else{
        Toast.makeText(context,"plz enable gps",Toast.LENGTH_LONG).show();
    }
        return null;
}
    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
