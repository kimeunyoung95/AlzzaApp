package org.sopt.alzza.tableview;


import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.sopt.alzza.R;
import org.sopt.alzza.model.Timetable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScheduleTableView extends LinearLayout {
    //显示表格时间view
    @Nullable
    @Bind(R.id.monday_1)
    TextView monday_1;
    @Nullable
    @Bind(R.id.monday_2)
    TextView monday_2;
    @Nullable
    @Bind(R.id.monday_3)
    TextView monday_3;
    @Bind(R.id.monday_4)
    TextView monday_4;
    @Nullable
    @Bind(R.id.monday_5)
    TextView monday_5;
    @Nullable
    @Bind(R.id.monday_6)
    TextView monday_6;
    @Bind(R.id.monday_7)
    TextView monday_7;
    @Nullable
    @Bind(R.id.monday_8)
    TextView monday_8;
    @Nullable
    @Bind(R.id.monday_9)
    TextView monday_9;


    @Nullable
    @Bind(R.id.tuesday_1)
    TextView tuesday_1;
    @Nullable
    @Bind(R.id.tuesday_2)
    TextView tuesday_2;
    @Nullable
    @Bind(R.id.tuesday_3)
    TextView tuesday_3;
    @Nullable
    @Bind(R.id.tuesday_4)
    TextView tuesday_4;
    @Nullable
    @Bind(R.id.tuesday_5)
    TextView tuesday_5;
    @Nullable
    @Bind(R.id.tuesday_6)
    TextView tuesday_6;
    @Bind(R.id.tuesday_7)
    TextView tuesday_7;
    @Nullable
    @Bind(R.id.tuesday_8)
    TextView tuesday_8;
    @Nullable
    @Bind(R.id.tuesday_9)
    TextView tuesday_9;

    @Nullable
    @Bind(R.id.wednesday_1)
    TextView wednesday_1;
    @Nullable
    @Bind(R.id.wednesday_2)
    TextView wednesday_2;
    @Nullable
    @Bind(R.id.wednesday_3)
    TextView wednesday_3;
    @Nullable
    @Bind(R.id.wednesday_4)
    TextView wednesday_4;
    @Nullable
    @Bind(R.id.wednesday_5)
    TextView wednesday_5;
    @Nullable
    @Bind(R.id.wednesday_6)
    TextView wednesday_6;
    @Nullable
    @Bind(R.id.wednesday_7)
    TextView wednesday_7;
    @Nullable
    @Bind(R.id.wednesday_8)
    TextView wednesday_8;
    @Nullable
    @Bind(R.id.wednesday_9)
    TextView wednesday_9;


    @Nullable
    @Bind(R.id.thursday_1)
    TextView thursday_1;
    @Nullable
    @Bind(R.id.thursday_2)
    TextView thursday_2;
    @Nullable
    @Bind(R.id.thursday_3)
    TextView thursday_3;
    @Nullable
    @Bind(R.id.thursday_4)
    TextView thursday_4;
    @Nullable
    @Bind(R.id.thursday_5)
    TextView thursday_5;
    @Nullable
    @Bind(R.id.thursday_6)
    TextView thursday_6;
    @Nullable
    @Bind(R.id.thursday_7)
    TextView thursday_7;
    @Nullable
    @Bind(R.id.thursday_8)
    TextView thursday_8;
    @Nullable
    @Bind(R.id.thursday_9)
    TextView thursday_9;


    @Nullable
    @Bind(R.id.friday_1)
    TextView friday_1;
    @Nullable
    @Bind(R.id.friday_2)
    TextView friday_2;
    @Nullable
    @Bind(R.id.friday_3)
    TextView friday_3;
    @Nullable
    @Bind(R.id.friday_4)
    TextView friday_4;
    @Nullable
    @Bind(R.id.friday_5)
    TextView friday_5;
    @Nullable
    @Bind(R.id.friday_6)
    TextView friday_6;
    @Nullable
    @Bind(R.id.friday_7)
    TextView friday_7;
    @Nullable
    @Bind(R.id.friday_8)
    TextView friday_8;
    @Nullable
    @Bind(R.id.friday_9)
    TextView friday_9;


    //表头星期
    @Nullable
    @Bind(R.id.week_monday_title)
    TextView monday_title;
    @Nullable
    @Bind(R.id.week_tuesday_title)
    TextView tuesday_title;
    @Nullable
    @Bind(R.id.week_wednesday_title)
    TextView wednesday_title;
    @Nullable
    @Bind(R.id.week_thursday_title)
    TextView thursday_title;
    @Nullable
    @Bind(R.id.week_friday_title)
    TextView friday_title;


    private List<String> mDays = new ArrayList<>();//保存当前一周的日期
    private Map<String, TextView> mTimeViews = new HashMap();//保存各个时间的view
    private List<TextView> mWeekTitles = new ArrayList<>();//表头星期
    private List<TextView> mWeekTimes = new ArrayList<>();//表头日期
    private Context mContext;
    public int[] setTimeViews;

    public ScheduleTableView(Context context) {
        this(context, null);
    }

    public ScheduleTableView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        View.inflate(context, R.layout.tableview_show_offline, this);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mTimeViews.put("11", monday_1);
        mTimeViews.put("12", monday_2);
        mTimeViews.put("13", monday_3);
        mTimeViews.put("14", monday_4);
        mTimeViews.put("15", monday_5);
        mTimeViews.put("16", monday_6);
        mTimeViews.put("17", monday_7);
        mTimeViews.put("18", monday_8);
        mTimeViews.put("19", monday_9);


        mTimeViews.put("21", tuesday_1);
        mTimeViews.put("22", tuesday_2);
        mTimeViews.put("23", tuesday_3);
        mTimeViews.put("24", tuesday_4);
        mTimeViews.put("25", tuesday_5);
        mTimeViews.put("26", tuesday_6);
        mTimeViews.put("27", tuesday_7);
        mTimeViews.put("28", tuesday_8);
        mTimeViews.put("29", tuesday_9);


        mTimeViews.put("31", wednesday_1);
        mTimeViews.put("32", wednesday_2);
        mTimeViews.put("33", wednesday_3);
        mTimeViews.put("34", wednesday_4);
        mTimeViews.put("35", wednesday_5);
        mTimeViews.put("36", wednesday_6);
        mTimeViews.put("37", wednesday_7);
        mTimeViews.put("38", wednesday_8);
        mTimeViews.put("39", wednesday_9);

        mTimeViews.put("41", thursday_1);
        mTimeViews.put("42", thursday_2);
        mTimeViews.put("43", thursday_3);
        mTimeViews.put("44", thursday_4);
        mTimeViews.put("45", thursday_5);
        mTimeViews.put("46", thursday_6);
        mTimeViews.put("47", thursday_7);
        mTimeViews.put("48", thursday_8);
        mTimeViews.put("49", thursday_9);


        mTimeViews.put("51", friday_1);
        mTimeViews.put("52", friday_2);
        mTimeViews.put("53", friday_3);
        mTimeViews.put("54", friday_4);
        mTimeViews.put("55", friday_5);
        mTimeViews.put("56", friday_6);
        mTimeViews.put("57", friday_7);
        mTimeViews.put("58", friday_8);
        mTimeViews.put("59", friday_9);


        mWeekTitles.add(monday_title);
        mWeekTitles.add(tuesday_title);
        mWeekTitles.add(wednesday_title);
        mWeekTitles.add(thursday_title);
        mWeekTitles.add(friday_title);
    }

    private void setDaysView() {
        String currentTime = TimeUtils.ss_long_2_str(System.currentTimeMillis());
        List<String> days = new ArrayList<>();
        if (mDays != null) {
            for (String day : mDays) {
                if (day.length() == 6) {
                    String[] split = day.split("-");
                    String substring = split[1] + "-" + split[2];
                    days.add(substring);
                }
                if (day.length() == 4) {
                    String substring_ = day.substring(4, 6);
                    String _substring = day.substring(6, 8);
                    String substring = substring_ + "-" + _substring;
                    days.add(substring);
                }
            }
            for (int i = 0; i < days.size(); i++) {
                if (currentTime.equals(days.get(i))) {
                    mWeekTitles.get(i).setTextColor(Color.RED);
                    mWeekTimes.get(i).setText("오늘");
                    mWeekTimes.get(i).setTextColor(Color.RED);
                } else {
                    mWeekTimes.get(i).setText(days.get(i));
                }
            }
        }

    }


    public void setTimeViews(List<Timetable> timetables){

        SetSubjectinfo[] info = new SetSubjectinfo[timetables.size()];
        for(int i=0;i<timetables.size();i++) {
            info[i] = new SetSubjectinfo();
            info[i].setTimetable(timetables.get(i));

            if(mTimeViews.containsKey(info[i].Remodel_time1()[i])){
                TextView textView = mTimeViews.get(info[i]);
                textView.setBackgroundResource(settextView_color[i]);
                textView.setText(info[i].subject_name);
                textView.setTextColor(Color.WHITE);
                textView.setGravity(Gravity.CENTER);
            }
            if(mTimeViews.containsKey(info[i].Remodel_time2()[i])){
                TextView textView = mTimeViews.get(info[i]);
                textView.setBackgroundResource(settextView_color[i]);
                textView.setText(info[i].subject_name);
                textView.setTextColor(Color.WHITE);
                textView.setGravity(Gravity.CENTER);
            }

        }
    }

    public int settextView_color[] = {
            R.drawable.textview_table_blue,
            R.drawable.textview_table_gray,
            R.drawable.textview_table_green,
            R.drawable.textview_table_normal,
            R.drawable.textview_table_pink,
            R.drawable.textview_table_red,
            R.drawable.textview_table_yellow
    };

}