package com.qun.test.statusbarcolordemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SetStatusBarColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setStatusBarColor(this, getResources().getColor(R.color.colorAccent));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_status_bar_color);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public static void enter(Context context) {
        Intent intent = new Intent(context, SetStatusBarColorActivity.class);
        context.startActivity(intent);
    }
}
