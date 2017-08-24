package org.sopt.alzza.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.sopt.alzza.R;

public class LoginActivity extends Activity {

    EditText usernameinput, passwordinput;
    Button loginButton, joinButton;
    ImageView loginImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bind();


    }


    private void bind() {

        usernameinput = (EditText) findViewById(R.id.usernameinput);
        passwordinput = (EditText) findViewById(R.id.passwordinput);
        loginButton = (Button) findViewById(R.id.loginButton);
       // joinButton = (Button) findViewById(R.id.joinButton);
        loginImage = (ImageView) findViewById(R.id.loginImage);


        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });


    }
}
