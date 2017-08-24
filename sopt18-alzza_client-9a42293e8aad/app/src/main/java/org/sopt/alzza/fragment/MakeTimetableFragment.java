package org.sopt.alzza.fragment;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.sopt.alzza.R;
import org.sopt.alzza.activity.SelectSubjectActivity;
import org.sopt.alzza.tableview.ScheduleTableView;
import org.sopt.alzza.tableview.TimeUtils;
import org.sopt.alzza.tableview.WeekToDay;

import java.text.ParseException;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:34
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class MakeTimetableFragment extends Fragment {

    Boolean bColorGray = true;
    private ScheduleTableView mTableView;

    TextView monday_1;
    TextView monday_2;
    TextView monday_3;
    TextView monday_4;
    TextView monday_5;
    TextView monday_6;
    TextView monday_7;
    TextView monday_8;
    TextView monday_9;

    TextView tuesday_1;
    TextView tuesday_2;
    TextView tuesday_3;
    TextView tuesday_4;
    TextView tuesday_5;
    TextView tuesday_6;
    TextView tuesday_7;
    TextView tuesday_8;
    TextView tuesday_9;

    TextView wednesday_1;
    TextView wednesday_2;
    TextView wednesday_3;
    TextView wednesday_4;
    TextView wednesday_5;
    TextView wednesday_6;
    TextView wednesday_7;
    TextView wednesday_8;
    TextView wednesday_9;

    TextView thursday_1;
    TextView thursday_2;
    TextView thursday_3;
    TextView thursday_4;
    TextView thursday_5;
    TextView thursday_6;
    TextView thursday_7;
    TextView thursday_8;
    TextView thursday_9;

    TextView friday_1;
    TextView friday_2;
    TextView friday_3;
    TextView friday_4;
    TextView friday_5;
    TextView friday_6;
    TextView friday_7;
    TextView friday_8;
    TextView friday_9;
    Button tv_main_nextbutton;
    Button tv_main_backbutton;


    @TargetApi(Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tableview_main, container, false);


        mTableView = (ScheduleTableView) view.findViewById(R.id.table_view);
        bind(view);
        onButtonClick();
        setTable();
        next_Event();
        return view;



    }


    private void onButtonClick() {
        mTableView.setBackgroundColor(Color.rgb(255, 255, 0));
    }


    private void setTable() {
        String s = TimeUtils.s_long_2_str(System.currentTimeMillis());
        try {
            String[] days = WeekToDay.getStringDate(s);
            //string 값에 값 받아오기 13대신 서버 값 받아오기
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //buttonClick 값
    public void bind(View view) {

        tv_main_nextbutton = (Button) view.findViewById(R.id.tv_main_nextbutton);
        tv_main_backbutton = (Button) view.findViewById(R.id.tv_main_backbutton);
        monday_1 = (TextView) view.findViewById(R.id.monday_1);
        monday_2 = (TextView) view.findViewById(R.id.monday_2);
        monday_3 = (TextView) view.findViewById(R.id.monday_3);
        monday_4 = (TextView) view.findViewById(R.id.monday_4);
        monday_5 = (TextView) view.findViewById(R.id.monday_5);
        monday_6 = (TextView) view.findViewById(R.id.monday_6);
        monday_7 = (TextView) view.findViewById(R.id.monday_7);
        monday_8 = (TextView) view.findViewById(R.id.monday_8);
        monday_9 = (TextView) view.findViewById(R.id.monday_9);
        tuesday_1 = (TextView) view.findViewById(R.id.tuesday_1);
        tuesday_2 = (TextView) view.findViewById(R.id.tuesday_2);
        tuesday_3 = (TextView) view.findViewById(R.id.tuesday_3);
        tuesday_4 = (TextView) view.findViewById(R.id.tuesday_4);
        tuesday_5 = (TextView) view.findViewById(R.id.tuesday_5);
        tuesday_6 = (TextView) view.findViewById(R.id.tuesday_6);
        tuesday_7 = (TextView) view.findViewById(R.id.tuesday_7);
        tuesday_8 = (TextView) view.findViewById(R.id.tuesday_8);
        tuesday_9 = (TextView) view.findViewById(R.id.tuesday_9);
        wednesday_1 = (TextView) view.findViewById(R.id.wednesday_1);
        wednesday_2 = (TextView) view.findViewById(R.id.wednesday_2);
        wednesday_3 = (TextView) view.findViewById(R.id.wednesday_3);
        wednesday_4 = (TextView) view.findViewById(R.id.wednesday_4);
        wednesday_5 = (TextView) view.findViewById(R.id.wednesday_5);
        wednesday_6 = (TextView) view.findViewById(R.id.wednesday_6);
        wednesday_7 = (TextView) view.findViewById(R.id.wednesday_7);
        wednesday_8 = (TextView) view.findViewById(R.id.wednesday_8);
        wednesday_9 = (TextView) view.findViewById(R.id.wednesday_9);
        thursday_1 = (TextView) view.findViewById(R.id.thursday_1);
        thursday_2 = (TextView) view.findViewById(R.id.thursday_2);
        thursday_3 = (TextView) view.findViewById(R.id.thursday_3);
        thursday_4 = (TextView) view.findViewById(R.id.thursday_4);
        thursday_5 = (TextView) view.findViewById(R.id.thursday_5);
        thursday_6 = (TextView) view.findViewById(R.id.thursday_6);
        thursday_7 = (TextView) view.findViewById(R.id.thursday_7);
        thursday_8 = (TextView) view.findViewById(R.id.thursday_8);
        thursday_9 = (TextView) view.findViewById(R.id.thursday_9);
        friday_1 = (TextView) view.findViewById(R.id.friday_1);
        friday_2 = (TextView) view.findViewById(R.id.friday_2);
        friday_3 = (TextView) view.findViewById(R.id.friday_3);
        friday_4 = (TextView) view.findViewById(R.id.friday_4);
        friday_5 = (TextView) view.findViewById(R.id.friday_5);
        friday_6 = (TextView) view.findViewById(R.id.friday_6);
        friday_7 = (TextView) view.findViewById(R.id.friday_7);
        friday_8 = (TextView) view.findViewById(R.id.friday_8);
        friday_9 = (TextView) view.findViewById(R.id.friday_9);


        monday_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        monday_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        monday_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });




        tuesday_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        tuesday_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        tuesday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        tuesday_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        tuesday_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        tuesday_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        tuesday_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        tuesday_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        tuesday_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });
        wednesday_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        wednesday_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        wednesday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        wednesday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });




        wednesday_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        wednesday_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        wednesday_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        wednesday_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        wednesday_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        wednesday_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });
        thursday_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        thursday_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        thursday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        thursday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });




        thursday_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        thursday_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        thursday_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        thursday_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        thursday_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        thursday_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        friday_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        friday_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        friday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        friday_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });




        friday_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });

        friday_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        friday_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        friday_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        friday_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });


        friday_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getTag() == "t") {
                    v.setBackgroundColor(Color.TRANSPARENT);
                    v.setTag("f");
                }
                else {
                    v.setBackgroundColor(Color.BLACK);
                    v.setTag("t");
                }
            }
        });



    }






    private void next_Event() {

        tv_main_nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), SelectSubjectActivity.class);
                startActivity(intent);

            }
        });
    }
}