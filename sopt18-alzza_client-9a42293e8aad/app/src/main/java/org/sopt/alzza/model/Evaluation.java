package org.sopt.alzza.model;

import android.support.annotation.NonNull;

import lombok.Data;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 30.
 * Time  : 오전 2:37
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  : 나중에 쓰게 될 강의평가 객체
 */

@Data
public class Evaluation {

    @NonNull
    Long id;

    @NonNull
    Long mid;

    @NonNull
    Long sid;

    @NonNull
    Double type1;

    @NonNull
    Double type2;

    @NonNull
    Double type3;

    @NonNull
    Double type4;

    @NonNull
    Double type5;

    @NonNull
    Integer satisfaction;

    String comment;

}
