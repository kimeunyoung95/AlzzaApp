package org.sopt.alzza.model;

import android.support.annotation.NonNull;

import lombok.Data;

/**
 * Created by NOEP on 2016. 6. 26..
 * 학교 정보를 가지고 있는 모델
 */

@Data
public class Subject {

    @NonNull
    Long id;

    @NonNull
    String university;

    @NonNull
    String college;

    @NonNull
    String dep_maj;

    @NonNull
    String subjectName;

    String department;

    String major;


}
