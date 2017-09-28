package com.example.dimaculangan.dimaculanganquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.dimaculangan.dimaculanganquiz1.CodeName;

public class MainActivity extends AppCompatActivity {

    Button btnPage1, btnPage2, btnPage3;
    ListView lv_Android;
    List<CodeName> listVersions;
    String[] codename;
    int[] logos;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPage1 = (Button) findViewById(R.id.page1);
        btnPage2 = (Button) findViewById(R.id.page2);
        btnPage3 = (Button) findViewById(R.id.page3);

        lv_Android = (ListView) findViewById(R.id.lvAndroid);
        listVersions = new ArrayList<CodeName>();
        codename = getResources().getStringArray(R.array.Codename);
        logos = new int[] {R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};
        for (int i=0; i <codename.length; i++) {
            listVersions.add(new CodeName(logos[i], codename[i]));
        }
        adapter = new CustomAdapter(this, listVersions);
        lv_Android.setAdapter(adapter);
        }

    

    public void firstPage (View view) {

        Intent intent = new Intent(this,Main2Activity.class);
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
