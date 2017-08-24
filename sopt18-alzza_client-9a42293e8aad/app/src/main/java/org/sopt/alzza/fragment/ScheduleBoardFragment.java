package org.sopt.alzza.fragment;

import android.annotation.TargetApi;
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
import org.sopt.alzza.application.App;
import org.sopt.alzza.model.Timetable;
import org.sopt.alzza.tableview.ScheduleTableView;
import org.sopt.alzza.tableview.TimeUtils;
import org.sopt.alzza.tableview.WeekToDay;

import java.text.ParseException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 7. 7.
 * Time  : 오후 11:06
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class ScheduleBoardFragment extends Fragment {

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


        @TargetApi(Build.VERSION_CODES.M)
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_scheduleboard, container, false);


//            mTableView = (ScheduleTableView) view.findViewById(R.id.table_view);
//            bind(view);
//            onButtonClick();
//            setTable();
//            next_Event();
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

            App.getInstance().getHttpService().getTimetableList(1l).enqueue(new Callback<List<Timetable>>() {
                @Override
                public void onResponse(Call<List<Timetable>> call, Response<List<Timetable>> response) {

                    List<Timetable> timetables = response.body();
                    mTableView.setTimeViews(timetables);
                }

                @Override
                public void onFailure(Call<List<Timetable>> call, Throwable t) {

                }
            });


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void bind(View view) {

            tv_main_nextbutton = (Button) view.findViewById(R.id.tv_main_nextbutton);
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

            switch (view.getId()) {
                case R.id.monday_1: {
                    Log.i("TAG", "11");
                    if (bColorGray) {
                        monday_1.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_1.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_2: {
                    Log.i("TAG", "12");
                    if (bColorGray) {
                        monday_2.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_2.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_3: {
                    Log.i("TAG", "13");
                    if (bColorGray) {
                        monday_3.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_3.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_4: {
                    Log.i("TAG", "14");
                    if (bColorGray) {
                        monday_4.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_4.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.monday_5: {
                    Log.i("TAG", "15");
                    if (bColorGray) {
                        monday_5.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_5.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_6: {
                    Log.i("TAG", "16");
                    if (bColorGray) {
                        monday_6.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_6.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_7: {
                    Log.i("TAG", "17");
                    if (bColorGray) {
                        monday_7.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_7.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_8: {
                    Log.i("TAG", "418");
                    if (bColorGray) {
                        monday_8.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_8.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.monday_9: {
                    Log.i("TAG", "19");
                    if (bColorGray) {
                        monday_9.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        monday_9.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;
///tuesday
                case R.id.tuesday_1: {
                    Log.i("TAG", "21");
                    if (bColorGray) {
                        tuesday_1.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_1.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_2: {
                    Log.i("TAG", "22");
                    if (bColorGray) {
                        tuesday_2.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_2.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_3: {
                    Log.i("TAG", "23");
                    if (bColorGray) {
                        tuesday_3.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_3.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_4: {
                    Log.i("TAG", "24");
                    if (bColorGray) {
                        tuesday_4.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_4.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.tuesday_5: {
                    Log.i("TAG", "25");
                    if (bColorGray) {
                        tuesday_5.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_5.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_6: {
                    Log.i("TAG", "26");
                    if (bColorGray) {
                        tuesday_6.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_6.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_7: {
                    Log.i("TAG", "27");
                    if (bColorGray) {
                        tuesday_7.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_7.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_8: {
                    Log.i("TAG", "28");
                    if (bColorGray) {
                        tuesday_8.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_8.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.tuesday_9: {
                    Log.i("TAG", "29");
                    if (bColorGray) {
                        tuesday_9.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        tuesday_9.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.wednesday_1: {
                    Log.i("TAG", "31");
                    if (bColorGray) {
                        wednesday_1.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_1.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_2: {
                    Log.i("TAG", "32");
                    if (bColorGray) {
                        wednesday_2.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_2.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_3: {
                    Log.i("TAG", "33");
                    if (bColorGray) {
                        wednesday_3.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_3.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_4: {
                    Log.i("TAG", "34");
                    if (bColorGray) {
                        wednesday_4.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_4.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.wednesday_5: {
                    Log.i("TAG", "35");
                    if (bColorGray) {
                        wednesday_5.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_5.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_6: {
                    Log.i("TAG", "36");
                    if (bColorGray) {
                        wednesday_6.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_6.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_7: {
                    Log.i("TAG", "37");
                    if (bColorGray) {
                        wednesday_7.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_7.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_8: {
                    Log.i("TAG", "38");
                    if (bColorGray) {
                        wednesday_8.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_8.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.wednesday_9: {
                    Log.i("TAG", "39");
                    if (bColorGray) {
                        wednesday_9.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        wednesday_9.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_1: {
                    Log.i("TAG", "41");
                    if (bColorGray) {
                        thursday_1.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_1.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_2: {
                    Log.i("TAG", "42");
                    if (bColorGray) {
                        thursday_2.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_2.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_3: {
                    Log.i("TAG", "43");
                    if (bColorGray) {
                        thursday_3.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_3.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_4: {
                    Log.i("TAG", "44");
                    if (bColorGray) {
                        thursday_4.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_4.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.thursday_5: {
                    Log.i("TAG", "45");
                    if (bColorGray) {
                        thursday_5.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_5.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_6: {
                    Log.i("TAG", "46");
                    if (bColorGray) {
                        thursday_6.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_6.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_7: {
                    Log.i("TAG", "47");
                    if (bColorGray) {
                        thursday_7.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_7.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_8: {
                    Log.i("TAG", "48");
                    if (bColorGray) {
                        thursday_8.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_8.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.thursday_9: {
                    Log.i("TAG", "49");
                    if (bColorGray) {
                        thursday_9.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        thursday_9.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.friday_1: {
                    Log.i("TAG", "51");
                    if (bColorGray) {
                        friday_1.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_1.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_2: {
                    Log.i("TAG", "52");
                    if (bColorGray) {
                        friday_2.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_2.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_3: {
                    Log.i("TAG", "53");
                    if (bColorGray) {
                        friday_3.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_3.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_4: {
                    Log.i("TAG", "54");
                    if (bColorGray) {
                        friday_4.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_4.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;


                case R.id.friday_5: {
                    Log.i("TAG", "55");
                    if (bColorGray) {
                        friday_5.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_5.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_6: {
                    Log.i("TAG", "56");
                    if (bColorGray) {
                        friday_6.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_6.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_7: {
                    Log.i("TAG", "57");
                    if (bColorGray) {
                        friday_7.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_7.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_8: {
                    Log.i("TAG", "58");
                    if (bColorGray) {
                        friday_8.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_8.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

                case R.id.friday_9: {
                    Log.i("TAG", "59");
                    if (bColorGray) {
                        friday_9.setBackgroundColor(Color.LTGRAY);
                        bColorGray = false;
                    } else {
                        friday_9.setBackgroundColor(Color.WHITE);
                        bColorGray = true;
                    }
                }
                break;

            }
        }






      private void next_Event() {

            tv_main_nextbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity().getApplicationContext(), SelectSubjectActivity.class);
                    startActivity(intent);

                }
            });       }
    }