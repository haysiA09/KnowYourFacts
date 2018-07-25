package com.example.a16022877.knowyourfacts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager vPager;
    ArrayList<Fragment> al;
    MyFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vPager = (ViewPager) findViewById(R.id.viewpager1);
        FragmentManager fm = getSupportFragmentManager();

        al = new ArrayList<Fragment>();
        al.add(new Frag1());
        al.add(new Frag2());
        al.add(new Frag3());

        adapter = new MyFragmentPagerAdapter(fm, al);

        vPager.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_next){
            int max = vPager.getChildCount();
            if (vPager.getCurrentItem() < max-1) {

                int nextPage = vPager.getCurrentItem() + 1;
                vPager.setCurrentItem(nextPage, true);
            }
        }
        if(id==R.id.action_previous){

            if (vPager.getCurrentItem() < 0) {
                int previousPage=vPager.getCurrentItem()-1;
                vPager.setCurrentItem(previousPage,true);
            }


        }
        return super.onOptionsItemSelected(item);
    }
}
