package com.example.baitapthietlaptt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.ClipData;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editinfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editinfo = (EditText) findViewById(R.id.editinfo);
    }

    public void display(View v)
        {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
            ClipData.Item editInfo;
            dlgAlert.setMessage(editinfo.getText().toString());
            dlgAlert.setTitle("Your Infomation");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

        }
    }
