package com.example.mobileappdevelop.testcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ArrayList<String>strings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.linear);
    }

    public void favourite(View view) {
        strings = new ArrayList<>();
        for(int i=0; i<linearLayout.getChildCount();i++){
            View view1 = linearLayout.getChildAt(i);
            if(view1 instanceof CheckBox){
                CheckBox checkBox = (CheckBox) view1;
                if(checkBox.isChecked()){

                }
            }
        }

    }


}
