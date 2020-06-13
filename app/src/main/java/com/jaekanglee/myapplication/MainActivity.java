package com.jaekanglee.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.editDollarAmount);
        Log.i("amount",dollarAmount.getText().toString());
        Double d = Double.parseDouble(dollarAmount.getText().toString());
        Double ratio = 0.74;
        Toast.makeText(MainActivity.this, "$"+(Double.valueOf(d*ratio)).toString(),Toast.LENGTH_SHORT).show();
    }
}