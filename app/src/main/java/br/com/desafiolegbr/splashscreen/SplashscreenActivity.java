package br.com.desafiolegbr.splashscreen;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

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

    }
}
