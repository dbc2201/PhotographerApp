package in.ac.gla.miniProject.Photographer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LoadImage extends AppCompatActivity {
    private ImageView imag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);
        imag=findViewById(R.id.imageView2);

        Intent intent = getIntent();
        String tmp=intent.getStringExtra("imageurl");
        Picasso.get().load(tmp).into(imag);

    }
}
