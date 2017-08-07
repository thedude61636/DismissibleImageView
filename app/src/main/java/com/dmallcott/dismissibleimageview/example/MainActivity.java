package com.dmallcott.dismissibleimageview.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dmallcott.dismissibleimageview.DismissibleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DismissibleImageView dismissibleImageView = (DismissibleImageView) findViewById(R.id.activity_main_dismissibleImageView);

        dismissibleImageView.setImageResource(R.mipmap.ic_launcher);
    }
}
