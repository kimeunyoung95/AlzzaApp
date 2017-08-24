package org.sopt.alzza.model;

import android.support.annotation.NonNull;

import java.util.Date;

import lombok.Data;

/**
 * Created by NOEP on 2016. 6. 26..
 * 과목별 시간표 정보를 가지고 있는 모델
 */

@Data
public class Timetable {

    @NonNull
    Long id;

    Long sid;

    @NonNull
    String subject_number;

    String professor;

    String classroom;

    @NonNull
    String subject_type;

    @NonNull
    String subject_name;

    Integer day1;

    Date start_time1;

    Date end_time1;

    Integer start_period1;

    Integer end_period1;

    String period1;

    Integer day2;

    Date start_time2;

    Date end_time2;

    Integer start_period2;

    Integer end_period2;

    String period2;

    String etc;


}
