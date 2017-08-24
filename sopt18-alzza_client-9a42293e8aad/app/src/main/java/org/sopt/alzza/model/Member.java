package org.sopt.alzza.model;

import android.support.annotation.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 30.
 * Time  : 오전 2:32
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
@Data
@NoArgsConstructor
public class Member {

    @NonNull
    Long id;

    @NonNull
    String email;

    @NonNull
    String pw;

    @NonNull
    String university;

    @NonNull
    String nickname;

    @NonNull
    Integer grade;

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

    Integer satisfaction;

    Integer usertype;

}
