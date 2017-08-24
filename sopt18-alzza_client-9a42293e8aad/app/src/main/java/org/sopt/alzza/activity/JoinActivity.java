package org.sopt.alzza.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.sopt.alzza.R;
import org.sopt.alzza.application.App;
import org.sopt.alzza.common.Constants;
import org.sopt.alzza.dto.Duplication;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class JoinActivity extends Activity {

    EditText input_email, input_pw, input_university, input_grade, input_nickname;
    TextView memberCheck;
    Button registerButton;

    boolean isDuplicate = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        private void bind() {

            memberCheck = (TextView) findViewById(R.id.member_check);
            input_email = (EditText) findViewById(R.id.input_email);
            input_pw = (EditText) findViewById(R.id.input_pw);
            input_university = (EditText) findViewById(R.id.input_university);
            input_grade = (EditText) findViewById(R.id.input_grade);
            input_nickname = (EditText) findViewById(R.id.input_nickname);
            registerButton = (Button) findViewById(R.id.commitbutton);

        }

        private void register_Event() {

            registerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (!TextUtils.isEmpty(input_email.getText().toString()) && Constants.isEmail(input_email.getText().toString()) && !isDuplicate &&
                            !TextUtils.isEmpty(input_pw.getText().toString()) &&
                            !TextUtils.isEmpty(input_university.getText().toString()) &&
                            !TextUtils.isEmpty(input_grade.getText().toString()) &&
                            !TextUtils.isEmpty(input_nickname.getText().toString())) {

                        Intent intent = new Intent(getApplicationContext(), LectureActivity.class);

                        intent.putExtra("input_email", input_email.getText().toString());
                        intent.putExtra("input_pw", input_pw.getText().toString());
                        intent.putExtra("input_university", input_university.getText().toString());
                        intent.putExtra("input_grade", Integer.valueOf(input_grade.getText().toString()));
                        intent.putExtra("input_nickname", input_nickname.getText().toString());

                        startActivity(intent);

                    } else {
                        Toast.makeText(JoinActivity.this, "紐⑤뱺 ?뺣낫媛 ???꾩닔?낅땲??", Toast.LENGTH_SHORT).show();

                    }

                }

            });
        }



