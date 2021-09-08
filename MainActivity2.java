package com.example.cicddemowithappcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getValueOrNull();
    }

    private void  getValueOrNull()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Log.e("List",""+list.get(0)); // 1
        Log.e("List",""+list.get(2)); // 3
        Log.e("List",""+list.get(3)); // null
    }
}