package com.example.bestem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MapActivity extends AppCompatActivity {

    JSONObject json_object;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("data"));
        try {
            json_object = new JSONObject(intent.getStringExtra("data"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
