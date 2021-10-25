package com.apprentissage.livrable1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText id=findViewById(R.id.editTextTextPersonName);
        EditText mdp=findViewById(R.id.editTextTextPassword);
        Button submit= (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id=="admin" && mdp=="123admin456"){

                }
            }
        });
    }

}