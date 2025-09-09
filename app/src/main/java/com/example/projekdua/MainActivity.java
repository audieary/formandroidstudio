package com.example.projekdua;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        radio1=findViewById(R.id.radioButton1);
        radio2=findViewById(R.id.radioButton2);
        radio3=findViewById(R.id.radioButton3);

    }
    public void onCreate(View view) {
        String nophone = editText.getText().toString();
        String pilih = " ";
        if (radio1.isChecked()) {
            pilih = "Telp Rumah";
        } else if (radio2.isChecked()) {
            pilih = "Mobile";
        } else if (radio3.isChecked()) {
            pilih = "Telp Kantor";
        }
        Toast.makeText(this, pilih + " " + nophone, Toast.LENGTH_SHORT).show();
    }
}
