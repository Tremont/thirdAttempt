package com.example.thirdattempt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button enter_bookName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter_bookName = findViewById(R.id.enter_bookName);
        setListeners();
    }
    private void setListeners() {
        //Sets addNameButton to go to the addName method
        enter_bookName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addName();
            }
        });

    }
    protected void addName(){
        Intent addName = new Intent(this,  AddBookNameActivity.class);
        startActivity(addName);
    }
}
