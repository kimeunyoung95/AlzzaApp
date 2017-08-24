package org.sopt.alzza.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.sopt.alzza.R;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:31
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class SplashActivity extends Activity {

    Handler handler = new Handler();

    int time = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);

                finish();
            }
        }, time);
    }
}