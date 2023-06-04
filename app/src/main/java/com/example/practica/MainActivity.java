package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb11,cb22,cb33;
    RadioButton r11,r22,r33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb11 = (CheckBox) findViewById(R.id.cb1);
        cb22 = (CheckBox) findViewById(R.id.cb2);
        cb33 = (CheckBox) findViewById(R.id.cb3);


        r11 = (RadioButton) findViewById(R.id.r1);
        r22 = (RadioButton) findViewById(R.id.r2);
        r33 = (RadioButton) findViewById(R.id.r3);
    }
    public void BT1(View view){
        String cad="Selecionado: ";
        if (cb11.isChecked()==true){
            cad+="CheckBox1 ";
        }
        if (cb22.isChecked()==true){
            cad+="CheckBox2 ";
        }
        if (cb33.isChecked()==true){
            cad+="CheckBox3 ";
        }
        if (r11.isChecked()==true){
            cad+="RadioButton1 ";
        }
        if (r22.isChecked()==true){
            cad+="RadioButton2 ";
        }
        if (r33.isChecked()==true){
            cad+="RadioButton3 ";
        }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }
}