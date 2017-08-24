package org.sopt.alzza.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.sopt.alzza.R;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:34
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class EvaluateFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_evaluate, container, false);



    }
}
