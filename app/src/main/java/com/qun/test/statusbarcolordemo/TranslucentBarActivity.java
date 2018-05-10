package com.qun.test.statusbarcolordemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class TranslucentBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setStatusBarTransparent(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent_bar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public static void enter(Context context) {
        Intent intent = new Intent(context, TranslucentBarActivity.class);
        context.startActivity(intent);
    }
}
