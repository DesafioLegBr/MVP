package br.com.desafiolegbr.splashscreen;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;

import br.com.desafiolegbr.R;
import br.com.desafiolegbr.databinding.ActivitySplashscreenBinding;

/**
 * Created by yasmin on 31/07/17.
 */

public class SplashscreenActivity extends Activity {

    ActivitySplashscreenBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_splashscreen);
        setupAnimation();
    }

    private void setupAnimation() {

        Runnable endAction = new Runnable() {
            @Override
            public void run() {
                mBinding.outletImageSplash.animate().scaleX(0).scaleY(0).setDuration(500);
            }
        };
        mBinding.outletImageSplash.animate().rotation(360 * 5).setDuration(1000 * 1 + 500)
                .setInterpolator(new FastOutSlowInInterpolator()).withEndAction(endAction);

    }

}
