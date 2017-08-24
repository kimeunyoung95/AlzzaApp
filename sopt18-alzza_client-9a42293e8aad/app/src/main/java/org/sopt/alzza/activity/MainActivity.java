package org.sopt.alzza.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import org.sopt.alzza.R;
import org.sopt.alzza.fragment.EmptyFragment;
import org.sopt.alzza.fragment.EvaluateFragment;
import org.sopt.alzza.fragment.HomeFragment;
import org.sopt.alzza.fragment.MakeTimetableFragment;
import org.sopt.alzza.fragment.RecommendFragment;
import org.sopt.alzza.fragment.ScheduleBoardFragment;

public class MainActivity extends FragmentActivity {

    private BottomBar mBottomBar;
    private MakeTimetableFragment mttfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.noTopOffset();
        mBottomBar.setItems(R.menu.bottombar_menu);

        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                Fragment fragment= new EmptyFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();

                switch (menuItemId) {
                    case R.id.bb_menu_recents :
                        fragment = new HomeFragment();
                    break;
                    case R.id.bb_menu_favorites :
                        fragment = new MakeTimetableFragment();
                    break;
                    case R.id.bb_menu_nearby :
                        fragment = new ScheduleBoardFragment();
                    break;
                    case R.id.bb_menu_friends :
                        fragment = new RecommendFragment();
                    break;
                    case R.id.bb_menu_food :
                        fragment = new EvaluateFragment();
                    break;

                }
                fragmentTransaction.replace(R.id.fragment_place,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
//                Toast.makeText(getApplicationContext(), TabMessage.get(menuItemId, true), Toast.LENGTH_SHORT).show();
            }
        });

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
        mBottomBar.mapColorForTab(1, 0xFF5D4037);
        mBottomBar.mapColorForTab(2, "#7B1FA2");
        mBottomBar.mapColorForTab(3, "#FF5252");
        mBottomBar.mapColorForTab(4, "#FF9800");

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState(outState);
    }


}