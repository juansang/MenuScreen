package com.example.menuscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);

        String[] items = getResources().getStringArray(R.array.options);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,R.layout.menu_item, items);

        menuList.setAdapter(adapt);


        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    Toast.makeText(getApplicationContext(), "START", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    Toast.makeText(getApplicationContext(), "HELP", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    Toast.makeText(getApplicationContext(), "SETTINGS", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    Toast.makeText(getApplicationContext(), "SCORES", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.gameoptions, menu);
        return true;
    }

}