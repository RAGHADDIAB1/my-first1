package com.example.raghad;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private TextView tvwelcom;
    private Button btchange , btExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      tvwelcom.findViewById(R.id.text);
      btchange.findViewById(R.id.button2);
      btExit.findViewById(R.id.button);

      btchange.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
tvwelcom.setText("welcom");
          }
      });



    }


}