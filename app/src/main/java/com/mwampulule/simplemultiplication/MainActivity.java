package com.mwampulule.simplemultiplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberEt;
    EditText secondNumberEt;

    TextView resultTv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firstNumberEt=findViewById(R.id.FirstNumber);
        secondNumberEt=findViewById(R.id.SecondNumber);
        resultTv = findViewById(R.id.Result);

    }
    public  void  chakata(View view){
        int FirstNumber = Integer.parseInt(firstNumberEt.getText().toString());
        int SecondNumber = Integer.parseInt(secondNumberEt.getText().toString());
        int jibu = FirstNumber * SecondNumber;

        resultTv.setText("jibu ni " + jibu);
    }
}