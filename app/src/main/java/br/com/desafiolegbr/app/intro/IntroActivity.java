package br.com.desafiolegbr.app.intro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

import br.com.desafiolegbr.R;


public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupToolbar();
        addSlide(AppIntroFragment.newInstance("DesafioLegBR", "Ensino na técnologia", R.drawable.splashscreen_desafio, Color.parseColor("#0097de")));
        addSlide(AppIntroFragment.newInstance("Um app com acessibilidade", "No mundo é necessário olhar pelo próximo." +
        "Buscamos isso atraves de uma grande acessibilidade para todos", R.drawable.img_acessibilidade, Color.parseColor("#FF4ABFED")));

    }

    private void setupToolbar(){
        getSupportActionBar().hide();
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
//        Intent intent = new Intent(IntroActivity.this, MenuActivity.class);
//        startActivity(intent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
//        Intent intent = new Intent(SplashscreenActivity.this, MenuActivity.class);
//        startActivity(intent);
    }
}
