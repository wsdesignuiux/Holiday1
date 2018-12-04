package com.example.vaibhav.holiday1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import custom_font.MyTextView;

public class Holiday1Activity extends AppCompatActivity {
    TextView holliday;
    MyTextView create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday1);
        create = (MyTextView)findViewById(R.id.create);
        holliday = (TextView)findViewById(R.id.holliday);

        Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/ArgonPERSONAL-Regular.otf");
        holliday.setTypeface(custom_fonts);


    }
}
