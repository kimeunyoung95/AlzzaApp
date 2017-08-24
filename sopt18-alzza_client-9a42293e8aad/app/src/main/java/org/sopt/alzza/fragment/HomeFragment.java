package org.sopt.alzza.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.sopt.alzza.R;
import org.sopt.alzza.activity.ChatLoginActivity;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:34
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class HomeFragment extends Fragment {

    FloatingActionButton talkButton;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        talkButton = (FloatingActionButton) view.findViewById(R.id.fab);
        talkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ChatLoginActivity.class);
                startActivity(intent);
            }
        });
        return view;



    }
}
