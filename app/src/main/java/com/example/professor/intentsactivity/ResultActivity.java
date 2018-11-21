package com.example.professor.intentsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txtParam1 = findViewById(R.id.txtParam1);
        TextView txtParam2 = findViewById(R.id.txtParam2);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        String param1 = params.getString("param1");
        String param2 = params.getString("param2");

        txtParam1.setText(param1);
        txtParam2.setText(param2);

        Button btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        setResult(10);
        finish();
    }

    @Override
    public void onBackPressed() {
        setResult(20);
        finish();
    }
}
