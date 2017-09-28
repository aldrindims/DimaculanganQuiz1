package com.example.dimaculangan.dimaculanganquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button homepage, page2, page3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        homepage = (Button) findViewById(R.id.home_btn);
        page2 = (Button) findViewById(R.id.page2);
        page3 = (Button) findViewById(R.id.page3);
    }

    public void homePage (View view) {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void secondPage (View view) {

        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);

    }

    public void thirdPage (View view) {

        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);

    }
}
