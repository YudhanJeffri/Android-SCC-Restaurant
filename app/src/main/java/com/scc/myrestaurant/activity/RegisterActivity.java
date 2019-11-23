package com.scc.myrestaurant.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.scc.myrestaurant.R;

public class RegisterActivity extends AppCompatActivity {
    TextView btn_pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_pindah = findViewById(R.id.textView4);
        btn_pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(view);
            }
        });
    }

}
