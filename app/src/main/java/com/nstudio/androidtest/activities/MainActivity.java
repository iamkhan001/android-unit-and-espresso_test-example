package com.nstudio.androidtest.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.nstudio.androidtest.R;
import com.nstudio.androidtest.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;

        final EditText editEmail = findViewById(R.id.editEmail);

        findViewById(R.id.btnCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString().trim();

                if (email.isEmpty()){
                    Toast.makeText(context,"Enter Email",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (Utils.checkEmailForValidity(email)){
                    Toast.makeText(context,"Email is valid",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context,"Invalid Email",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
