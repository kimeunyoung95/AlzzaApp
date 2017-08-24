package org.sopt.alzza.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.sopt.alzza.R;
import org.sopt.alzza.application.App;
import org.sopt.alzza.model.Member;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by win10_pc on 2016-06-26.
 */
public class LectureActivity extends Activity {

    SeekBar seekBar1, seekBar2, seekBar3, seekBar4, seekBar5;
    TextView textView4, textView7, textView9;
    TextView status, status2, status3, status4, status5;
    Button commitbutton;
    Member member;
    SignupListener listener = new SignupListener();


    private static Typeface mTypeface = null;

    private void setGlobalFont(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                int vgCnt = vg.getChildCount();
                for (int i = 0; i < vgCnt; i++) {
                    View v = vg.getChildAt(i);
                    if (v instanceof TextView) {
                        ((TextView) v).setTypeface(mTypeface);
                    }
                    setGlobalFont(v);
                }
            }
        }
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture_main);
//        if (mTypeface == null) {
//            mTypeface = Typeface.createFromAsset(this.getAssets(), "NOTOSANSKR-LIGHT_0.OTF"); // 외부폰트 사용
        //mTypeface = Typeface.MONOSPACE;	// 내장 폰트 사용
//        }
//        setGlobalFont(getWindow().getDecorView());

        Intent intent = getIntent();
        member = new Member();
        member.setEmail(intent.getStringExtra("input_email"));
        member.setPw(intent.getStringExtra("input_pw"));
        member.setUniversity(intent.getStringExtra("input_university"));
        member.setGrade(intent.getIntExtra("input_grade", 1));
        member.setNickname(intent.getStringExtra("input_nickname"));


        bind();
        commitButton_Event();
        SeekBar1();
        SeekBar2();
        SeekBar3();
        SeekBar4();
        SeekBar5();
    }


    private void bind() {


        textView4 = (TextView) findViewById(R.id.textView4);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView9 = (TextView) findViewById(R.id.textView9);

        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar4 = (SeekBar) findViewById(R.id.seekBar4);
        seekBar5 = (SeekBar) findViewById(R.id.seekBar5);

        status = (TextView) findViewById(R.id.status1);
        status2 = (TextView) findViewById(R.id.status2);
        status3 = (TextView) findViewById(R.id.status3);
        status4 = (TextView) findViewById(R.id.status4);
        status5 = (TextView) findViewById(R.id.status5);
        commitbutton = (Button) findViewById(R.id.commitbutton);

    }

    private void SeekBar1() {
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                status.setText(progress + "점");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void SeekBar2() {
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                status2.setText(progress + "점");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void SeekBar3() {
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                status3.setText(progress + "점");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void SeekBar4() {
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                status4.setText(progress + "점");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void SeekBar5() {
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                status5.setText(progress + "점");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void commitButton_Event() { commitbutton.setOnClickListener(listener); }

    private class SignupListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            member.setType1((double) seekBar1.getProgress());
            member.setType2((double) seekBar2.getProgress());
            member.setType3((double) seekBar3.getProgress());
            member.setType4((double) seekBar4.getProgress());
            member.setType5((double) seekBar5.getProgress());
            commitbutton.setOnClickListener(null);
            App.getInstance().getHttpService().signUp(member).enqueue(new Callback<Member>() {
                @Override
                public void onResponse(Call<Member> call, Response<Member> response) {
                    Log.e("tag","RESOPONSE");
                    Intent intent1 = new Intent(LectureActivity.this, MainActivity.class);
                    startActivity(intent1);
                    finish();
                }

                @Override
                public void onFailure(Call<Member> call, Throwable t) {

                    commitbutton.setOnClickListener(listener);
                    Toast.makeText(getApplicationContext(), "회원가입을 할 수 없습니다.", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}


