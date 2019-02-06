package com.example.table;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    private TableRow titleRow,header,row3,row4,row5;
    private TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleRow = (TableRow) findViewById(R.id.titleRowid);
        header = (TableRow) findViewById(R.id.headerid);
        row3 = (TableRow) findViewById(R.id.row3id);
        row4 = (TableRow) findViewById(R.id.row4id);
        row5 = (TableRow) findViewById(R.id.row5id);
        textView = (TextView) findViewById(R.id.textViewid);
        row5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button is clicked");
            }
        });
    }
}
