package com.example.filimo;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.StatusBarManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.service.notification.StatusBarNotification;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_main,new FragmentSplash());
        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}