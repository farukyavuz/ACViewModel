package org.faruk.acviewmodel.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.faruk.acviewmodel.R;

/**
 * Created by farukyavuz on 27.03.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.screen_container, new ListFragment())
                    .commit();
        }
    }
}
