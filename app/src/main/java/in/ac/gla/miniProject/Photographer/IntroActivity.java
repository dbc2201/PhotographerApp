package in.ac.gla.miniProject.Photographer;

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
    addSlide(AppIntroFragment.newInstance("welcome to our app","JWDAJDJDDSJADJK",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
    addSlide(AppIntroFragment.newInstance("welcome to SECOND app","JWDAJDJDDSJADJK",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
    addSlide(AppIntroFragment.newInstance("welcome to THIRD app","JWDAJDJDDSJADJK",R.mipmap.ic_launcher_round, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));

}

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
    }
}
