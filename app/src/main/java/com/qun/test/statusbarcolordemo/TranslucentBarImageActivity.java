package com.qun.test.statusbarcolordemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TranslucentBarImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setStatusBarTransparent(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent_bar_image);
    }

    public static void enter(Context context) {
        Intent intent = new Intent(context, TranslucentBarImageActivity.class);
        context.startActivity(intent);
    }
}
