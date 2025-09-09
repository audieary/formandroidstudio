package com.example.projekdua;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
    }

    public void onCreate(View view) {
        String phone = editText.getText().toString();
        String pilih = "";
        if (radioButton1.isChecked()) {
            pilih = "telp pribadi";
        } else if (radioButton2.isChecked()) {
            pilih = "telp kantor";
        } else if (radioButton3.isChecked()) {
            pilih = "telp rumah";
        }
        Toast.makeText(this, pilih + " " + phone, Toast.LENGTH_SHORT).show();
    }
}
