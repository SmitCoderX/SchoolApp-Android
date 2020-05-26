package com.example.sangariyaadarshsrsecschool;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.gauravk.bubblenavigation.BubbleNavigationConstraintView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BubbleNavigationConstraintView  bubbleNavigation;

        bubbleNavigation = findViewById(R.id.navigation_bar);

        bubbleNavigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                //navigation changed, do something

                Fragment fragment;
                if (view == findViewById(R.id.c_item_rest))
                {
                    fragment = new Fragment();
                    FragmentManager manager = getFragmentManager();
                    FragmentTransaction ft = manager.beginTransaction();
                    ft.replace(R.id.dashboard_fragment, fragment);
                    ft.commit();
                }
            }
        });
    }
}