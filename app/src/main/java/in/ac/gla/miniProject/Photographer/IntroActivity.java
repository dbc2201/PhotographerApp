package in.ac.gla.miniProject.Photographer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {
 @Override
public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addSlide(AppIntroFragment.newInstance("WELCOME","Photographer's App",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
    addSlide(AppIntroFragment.newInstance("Keep Your Memories Forever","We will provide the best",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
    addSlide(AppIntroFragment.newInstance("Free To Chose","When You Need",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));

}

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this,Login.class);
        startActivity(intent);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this,Login.class);
        startActivity(intent);

    }
}
