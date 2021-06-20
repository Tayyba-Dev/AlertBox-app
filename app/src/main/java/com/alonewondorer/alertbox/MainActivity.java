package com.alonewondorer.alertbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {

        showDialog();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  showDialog()
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Close App")
                .setMessage("Are you sure you want to exit.")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this,"ok press",Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"close press",Toast.LENGTH_LONG).show();

                        MainActivity.super.onBackPressed();
                    }
                }).show();

    }
    public void show(View view) {


    }
}