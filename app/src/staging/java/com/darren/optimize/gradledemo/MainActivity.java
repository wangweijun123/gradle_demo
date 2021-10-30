package com.darren.optimize.gradledemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.darren.optimize.lib2.Mylib2;
import com.darren.optimize.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 依赖第一个lib
        MyLibrary.add(1,2);
        // 依赖第二个lib
        Mylib2.print();

//        Mylib3.print3();
    }
}