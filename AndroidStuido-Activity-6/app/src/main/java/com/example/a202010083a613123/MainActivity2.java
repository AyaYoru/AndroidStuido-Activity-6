package com.example.a202010083a613123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      //  Log.d(tag:"activityB",msg:"Activity B onCreate");
    }

    protected void onStart() {
        super.onStart();
// The activity is about to become visible.
    }

    public void GotoA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
