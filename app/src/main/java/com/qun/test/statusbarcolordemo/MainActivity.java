package com.qun.test.statusbarcolordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lv);
        data.add("透明状态栏");
        data.add("有图片的透明状态栏");
        data.add("改变状态栏颜色");
        data.add("普通侧滑导航");
        data.add("沉浸侧滑导航");
        data.add("在ToolBar下的侧滑导航");
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    TranslucentBarActivity.enter(MainActivity.this);
                }
                if (position == 1) {
                    TranslucentBarImageActivity.enter(MainActivity.this);
                }
                if (position == 2) {
                    SetStatusBarColorActivity.enter(MainActivity.this);
                }
                if (position == 3) {
                    NavigationDrawerActivity.enter(MainActivity.this);
                }
                if (position == 4) {
                    ImmerseNavigationDrawerActivity.enter(MainActivity.this);
                }
                if (position == 5) {
                    BelowToolBarNavigationDrawerActivity.enter(MainActivity.this);
                }
            }
        });
    }

}
